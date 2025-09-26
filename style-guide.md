# Style

## WE WILL BE FOLLOWING CPP CORE GUIDELINES AND MODIFIED GOOGLE STYLE GUIDE

<https://isocpp.github.io/CppCoreGuidelines/CppCoreGuidelines>

<https://google.github.io/styleguide/cppguide.html>

## Classes & Structs

### Headers (.h)

Use `.h` extension ONLY.

Name for this header should be `Point.h`, even though inner struct is lowercase
Many structs should be included in class definition header files if related
Use CamelCase for file names.


```c++
// PascelCase may be relaxed for some structs
// But others may use it
struct point {
    // NO CONSTRUCTORS OR PRIVATE MEMBERS
    // FUNCTIONS ONLY VERY SPARINGLY
    // Each var gets own line
    int32_t x;
    int32_t y;
}
```

File should be named `Widget.h`.

```c++
// Standard lib stuff use angle bracket #include <stdlib> syntax
// user made headers should use "", these are placed below angle includes
#include <stdlib>

#include "Point.h"
// max 80 col lines
// lowercase namespace names
// no indentation inside namespace
namespace things {
// Capitalized class Names
// PascelCase names, i.e.
// class CoolWidget { \* ... */ }
/// Follow https://llvm.org/docs/CodingStandards.html#doxygen-use-in-documentation-comments
/// for doxygen comments, we might not be using them but it would be helpful
class Widget {
   public: // public before private, 3 space indenting
    Widget(); // constructiors, rule of 5
    // if defining constructor, define all others
    Widget(const Widget& widget) = default;
    Widget(Widget&& widget) = delete; 
    Widget& operator=(const Widget&& widget) = default;
    Widget& operator=(const Widget& widget) = delete;

    void doThing() { /* ... */ } // camelCase methods 
   private:
    // lowercase, snake_case member variable names, 
    // underscore_ afterwards identifier
    int32_t super_cool_counter_; // recommend using fixed-width integral types 
    point pt_;
};

// "namespace <name>" at end bracket of namespace
// clang tidy should do this for you
} // namespace things
```

If a constructor needs many arguments, write a struct for arguments.

i.e.

```c++
struct WidgetArgs {
    type abc;
    type def;
    type hij;
}
```

### Implementation (.cpp) files

```c++
// everything still wrapped in namespace
namespace things {

void Widget::doThings() {
    // camelCase variable names everywhere, no underscore for non member var

    // use DESIGNATED INITALIZER FOR STRUCTS, this is cpp 20 feature
    // ^ clang tidy shouold warn you for this ^
    Point pt = {.x = 5, .y = 1}; // {.x = 5, .y = 1} is designated intalizer
    pt_ = pt;    
}

} // namespace things
```

Structs should generally not have `.cpp` files.

## Variables

```c++
ioint pt = {.x = 5, .y = 1}; // as shown above in class implementation

// for basic types use snake_case
// if using static_cast to initalize var, use auto
long long long_thing = 1;
auto int_thing = static_cast<int>(long_thing);

// ALWAYS GENERALLY CONSTRUCT THINGS
// below is correct naming, but not constructed
// for class names, use camelCase
CoolWidget coolWidget; 
```

