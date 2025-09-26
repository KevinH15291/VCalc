#include <cstddef>
#include <optional>
#include <cstdint>

namespace vcalc {
struct Type {
    enum class Kind : uint8_t { ERROR, INT, VECTOR } kind_ = Kind::ERROR;
    std::optional<size_t> size_ = std::nullopt;
};
}  // namespace vcalc