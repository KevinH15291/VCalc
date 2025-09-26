#include <stdio.h>

// Add function named intPrint with signature void(int) to llvm to have this linked in.
void intPrint(int32_t i) {
  printf("%d\n", i);
}

// Printing phat pointer vector
void vectorPrint(void *v) {
  int32_t size = ((int32_t *)v)[0];
  printf("[");
  for (int32_t i = 1; i <= size; ++i) {
    printf("%d", ((int32_t *)v)[i]);
    if (i < size) {
      printf(", ");
    }
  }
  printf("]\n");
}
