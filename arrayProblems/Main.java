import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please Enter the array limit: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Please Enter the " + i + "th element: ");
      arr[i] = scanner.nextInt();
    }

    removeDuplicates(arr, arr.length);
  }

  public static int findLargest(int[] arr) {
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void findSecondLargestnSmallest(int[] arr) {

    int largest = Integer.MIN_VALUE;
    int _2largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int _2smallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        _2largest = largest;
        largest = arr[i];
      }
      if (arr[i] < smallest) {
        _2smallest = smallest;
        smallest = arr[i];
      }
      if (arr[i] < largest && arr[i] > _2largest) {
        _2largest = arr[i];
      }
      if (arr[i] > smallest && arr[i] < _2smallest) {
        _2smallest = arr[i];
      }
    }

    if (_2largest == Integer.MIN_VALUE && _2smallest == Integer.MAX_VALUE) {
      System.out.println("-1");
      return;
    }

    System.out
        .println("Second Largest: " + _2largest + " Second Smallest" + _2smallest);

  }

  public static boolean checkSortedRotated(int[] arr) {
    int flipped = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] <= arr[i - 1]) {
        flipped++;
      }
      if (flipped >= 2) {
        break;
      }
    }
    if (flipped == 0 || (flipped == 1 && arr[0] > arr[arr.length - 1])) {
      return true;
    }
    return false;
  }

  public static void removeDuplicates(int[] arr, int n) {
    int i = 0;
    int current = 0;
    while (i < n - 1) {
      if (arr[i] == arr[i + 1]) {
        i++;
        continue;
      } else {
        arr[current] = arr[i];
        i++;
        current++;
      }
    }
    if (arr[arr.length - 1] != arr[current]) {
      arr[current] = arr[arr.length - 1];
    }
    for (int j = 0; j <= current; j++) {
      System.out.println(arr[j]);
    }
  }
}
