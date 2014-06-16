List a = [5, 2, 10, 6234, 612, -12, 162, 0, 12 - 1, 1263 * 9, (721 - 12) * 2, 2 * 2 + 2 - 1 + -1];

void main() {
  int size = length(a);
  for (int i = 0; i < size - 1; i = i + 1) {
    for (int j = i + 1; j < size; j = j + 1) {
      if (a[i] > a[j]) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
      }
    }
  }

  for (int i = 0; i < size; i = i + 1) {
    print(a[i]);
  }
}