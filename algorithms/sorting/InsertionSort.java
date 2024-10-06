package algorithms.sorting;

public class InsertionSort {

  public void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1] > temp) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = temp;
    }
  }

  public void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + "  ");
    }
  }
}
