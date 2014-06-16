void main() {
  List a = [61283, 1237, -1235689, 123 * 132, 12 + 512 + 1238 - 1235, ((1235 + 123) - -12 * 21) * 10, 125, 729, 0 * 0];
  heapSort(a);
  for (int i = 0; i < length(a); i = i + 1) {
    print(a[i]);
  }
}

void heapSort(List a) {
  int n = length(a);
  for (int i = n / 2; i >= 0; i = i - 1) {
    percDown(a, i, n);
  }
  for (int i = n - 1; i > 0; i = i - 1) {
    swap(a, 0, i);
    percDown(a, 0, i);
  }
}

int leftChild(int i) {
  return 2 * i + 1;
}

void percDown(List a, int i, int n) {
  int child, tmp = a[i];
  for (; leftChild(i) < n; i = child) {
    child = leftChild(i);
    if (child != n - 1 && a[child] < a[child + 1]) {
      child = child + 1;
    }
    if (tmp < a[child]) {
      a[i] = a[child];
    } else {
      break;
    }
  }
  a[i] = tmp;
}

void swap(List a, int i, int j) {
  int tmp = a[i];
  a[i] = a[j];
  a[j] = tmp;
}
