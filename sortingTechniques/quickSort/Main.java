public class Main {

  public static void main(String args[]) {
    int[] inpArr = { 23, 4, 4, 3, 33, 33, 2, 2, 1, 55, 6, 7, 343 };
    quickSort(inpArr, 0, inpArr.length - 1);
    for (int el : inpArr) {
      System.err.println(el);
    }
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (high <= low) {
      return;
    }
    int pivot = sorter(arr, low, high);

    quickSort(arr, low, pivot - 1);
    quickSort(arr, pivot + 1, high);
  }

  public static int sorter(int[] arr, int start, int end) {
    int i = start;
    int j = end;
    int pivot = arr[start];

    while (i < j) {
      while (arr[i] <= pivot && i < j) {
        i++;
      }
      while (arr[j] > pivot) {
        j--;
      }
      if (i < j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }
    }
    arr[start] = arr[j];
    arr[j] = pivot;
    return j;
  }
}
