package algorithms.sorting;

public class MergeSort {

  public void merge(int[] A, int left, int middle, int right) {
    int[] leftTmpArray = new int[middle - left + 2];
    int[] rightTmpArray = new int[right - middle + 1];
    for (int i = 0; i <= middle - left; i++) {
      leftTmpArray[i] = A[left + i];
    }
    for (int i = 0; i < right - middle; i++) {
      rightTmpArray[i] = A[middle + 1 + i];
    }

    leftTmpArray[middle - left + 1] = Integer.MAX_VALUE;
    rightTmpArray[right - middle] = Integer.MAX_VALUE;

    int i = 0;
    int j = 0;
    for (int k = left; k <= right; k++) {
      if (leftTmpArray[i] < rightTmpArray[j]) {
        A[k] = leftTmpArray[i];
        i++;
      } else {
        A[k] = rightTmpArray[j];
        j++;
      }

    }

  }

  public void mergeSort(int[] array, int left, int right) {
    if (right > left) {
      int m = (left + right) / 2;
      mergeSort(array, left, m);
      mergeSort(array, m + 1, right);
      merge(array, left, m, right);
    }
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + "  ");
    }
  }
}
