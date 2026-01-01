public class Main {
  public static void main(String args[]) {
    int[] inpArr = { 2, 3, 4, 1, 6, 11, 8, 5 };
    selectionSort(inpArr);
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int index = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[index] > arr[j]) {
          index = j;
        }
      }
      int tmp = arr[i];
      arr[i] = arr[index];
      arr[index] = tmp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
