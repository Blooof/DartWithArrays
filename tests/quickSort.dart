void main() {
  List a = [61283, 1237, -1235689, 123 * 132, 12 + 512 + 1238 - 1235, ((1235 + 123) - -12 * 21) * 10, 125, 729, 0 * 0];
  qSort(a, 0, length(a) - 1);
  for (int i = 0; i < length(a); i = i + 1) {
    print(a[i]);
  }
}

void qSort(List a, int low, int high) {
  int i = low, j = high;
  int pivot = a[low + (high - low) / 2];
  while (i <= j) {
    while (a[i] < pivot) {
      i = i + 1;
    }
    while (a[j] > pivot) {
      j = j - 1;
    }
    if (i <= j) {
      swap(a, i, j);
      i = i + 1;
      j = j - 1;
    }
  }
  if (low < j)qSort(a, low, j);
  if (i < high)qSort(a, i, high);
}

void swap(List a, int i, int j) {
  int tmp = a[i];
  a[i] = a[j];
  a[j] = tmp;
}
