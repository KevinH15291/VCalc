#include <cstddef>
#include <optional>

namespace vcalc {
struct Type {
    enum class Kind : uint8_t { INT, VECTOR } kind;
    std::optional<size_t> size;
};
}  // namespace vcalc