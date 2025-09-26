#include <cstddef>
#include <optional>
#include <cstdint>
#include "Type.h"

namespace vcalc {
struct Variable {
    Type type_;
    std::optional<uint32_t> loc_ = std::nullopt;
    bool pure_ = true; // whether the variable is pure (i.e. not modified in the program)
};
}  // namespace vcalc