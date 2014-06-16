List insert(List array, int index, int value) {
  int newSize = length(array) + 1;
  List newArray = list(newSize);
  for (int i = 0; i < index; i = i + 1) {
    newArray[i] = array[i];
  }
  newArray[index] = value;
  for (int i = index + 1; i < newSize; i = i + 1) {
    newArray[i] = array[i - 1];
  }
  return newArray;
}

List remove(List array, int index) {
  int newSize = length(array) - 1;
  List newList = list(newSize);
  for (int i = 0; i < index; i = i + 1) {
    newList[i] = array[i];
  }
  for (int i = index; i < newSize; i = i + 1) {
    newList[i] = array[i + 1];
  }
  return newList;
}