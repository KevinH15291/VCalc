cmake_minimum_required(VERSION 3.0)
project(VCalc)

set(CMAKE_EXPORT_COMPILE_COMMANDS ON)

# Ensure tool dependencies.
include(ExternalProject) # Required to download and build external projects (i.e. ANTLR).
find_package(Git REQUIRED) # Need git to download ANTLR through ExternalProject.
find_package(Java COMPONENTS Runtime REQUIRED) # Need java to run ANTLR, but only the runtime.

# Ensure we have LLVM.
include("${CMAKE_SOURCE_DIR}/cmake/get_mlir.cmake")

# Link against the pthreads library to make std::call_once 
# in generated ANTLR code to run without producing system errors
# (see issue https://github.com/antlr/antlr4/issues/3708).
set(THREADS_PREFER_PTHREAD_FLAG TRUE)
find_package(Threads REQUIRED)

option(ENABLE_ASAN "Enable AddressSanitizer" OFF)
if(ENABLE_ASAN)
  message(STATUS "ASan enabled")

  # Choose flags per compiler (works for AppleClang/Clang/GNU)
  if(CMAKE_CXX_COMPILER_ID MATCHES "Clang|AppleClang")
    set(_ASAN_COMPILE_FLAGS "-fsanitize=address -fsanitize-address-use-after-scope -fno-omit-frame-pointer -g -O1")
    set(_ASAN_LINK_FLAGS    "-fsanitize=address")
  elseif(CMAKE_CXX_COMPILER_ID STREQUAL "GNU")
    set(_ASAN_COMPILE_FLAGS "-fsanitize=address -fno-omit-frame-pointer -g -O1")
    set(_ASAN_LINK_FLAGS    "-fsanitize=address")
  else()
    set(_ASAN_COMPILE_FLAGS "")
    set(_ASAN_LINK_FLAGS    "")
  endif()

  # Apply to both C and C++; and to exe/shared/module linkers
  set(CMAKE_C_FLAGS             "${CMAKE_C_FLAGS} ${_ASAN_COMPILE_FLAGS}")
  set(CMAKE_CXX_FLAGS           "${CMAKE_CXX_FLAGS} ${_ASAN_COMPILE_FLAGS}")
  set(CMAKE_EXE_LINKER_FLAGS    "${CMAKE_EXE_LINKER_FLAGS} ${_ASAN_LINK_FLAGS}")
  set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} ${_ASAN_LINK_FLAGS}")
  set(CMAKE_MODULE_LINKER_FLAGS "${CMAKE_MODULE_LINKER_FLAGS} ${_ASAN_LINK_FLAGS}")
endif()


# Set C++ standards.
set(CMAKE_CXX_STANDARD 20)

# Add CXX flags.
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wno-comment")

# Include cmake utilities.
include("${CMAKE_SOURCE_DIR}/cmake/symlink_to_bin.cmake")

# Grab ANTLR.
include("${CMAKE_SOURCE_DIR}/cmake/get_antlr.cmake")

# Set up paths and info to generate ANTLR sources with.
set(GRAMMAR_NAME "VCalc")
set(ANTLR_NAMESPACE "vcalc")

# Generate sources.
include("${CMAKE_SOURCE_DIR}/cmake/antlr_generate.cmake")

# Include project headers.
include_directories("${CMAKE_SOURCE_DIR}/include")

# Build the source directory.
add_subdirectory("${CMAKE_SOURCE_DIR}/src")

# Add the runtime directory.
add_subdirectory("${CMAKE_CURRENT_SOURCE_DIR}/runtime")
