import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

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

    findSingleOccuranceElement(arr, n);

    // System.out.print("Please Enter the array2 limit: ");
    // int m = scanner.nextInt();
    // int[] arr2 = new int[m];
    //
    // for (int i = 0; i < m; i++) {
    // System.out.print("Please Enter the " + i + "th element: ");
    // arr2[i] = scanner.nextInt();
    // }
    // int[] newArr = unionOf2Array(arr, arr2, arr.length, arr2.length);

    for (int el : arr) {
      System.out.print(el + " ");
    }
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

  public static void shiftToLeftBy1(int[] arr, int n) {
    int first = arr[0];
    for (int i = 0; i < n - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[n - 1] = first;
  }

  public static void shiftToLeftByn(int[] arr, int n, int jumper) {
    if (jumper > n) {
      return;
    }
    int[] firstN = new int[jumper];

    for (int i = 0; i < jumper; i++) {
      firstN[i] = arr[i];
    }

    for (int i = jumper; i < n; i++) {
      arr[i - jumper] = arr[i];
    }

    int tmp = 0;
    for (int i = n - jumper; i < n; i++) {
      arr[i] = firstN[tmp];
      tmp++;
    }
  }

  public static void shiftToRightByn(int[] arr, int n, int jumper) {
    if (jumper > n) {
      return;
    }
    int[] lastN = new int[jumper];

    int tmp = 0;
    for (int i = (n - jumper); i < n; i++) {
      lastN[tmp] = arr[i];
      tmp++;
    }

    for (int el : lastN) {
      System.out.print(el + " ");
    }

    System.out.println();

    for (int i = n - 1; i > jumper - 1; i--) {
      arr[i] = arr[i - jumper];
    }

    for (int i = 0; i < lastN.length; i++) {
      arr[i] = lastN[i];
    }
  }

  public static void moveZeroToEnd(int[] arr, int n) {
    int pointer = 0;
    int target = 1;
    while (target < n) {
      if (arr[target] != 0) {
        arr[pointer] = arr[target];
        pointer++;
      }
      target++;
    }
    while (pointer < n) {
      arr[pointer] = 0;
      pointer++;
    }
  }

  public static void linearSearch(int[] arr, int n) {
    int target = 4;
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        System.out.println(i);
        return;
      }
    }
    System.out.println("-1");
    return;
  }

  public static int[] unionOf2Array(int[] arr, int[] arr2, int n1, int n2) {
    int p1 = 0;
    int p2 = 0;
    int[] newArr = new int[n1 + n2];
    int currentP = 0;
    while (p1 < n1 && p2 < n2) {

      if (p1 != 0) {
        if (arr[p1] == arr[p1 - 1]) {
          p1++;
          continue;
        }
      }
      if (p2 != 0) {
        if (arr2[p2] == arr2[p2 - 1]) {
          p2++;
          continue;
        }
      }

      if (arr[p1] < arr2[p2]) {
        newArr[currentP] = arr[p1++];
        currentP++;
      } else if (arr2[p2] < arr[p1]) {
        newArr[currentP] = arr2[p2++];
        currentP++;
      } else {
        newArr[currentP] = arr[p1];
        p1++;
        p2++;
        currentP++;
      }

    }
    if (p1 != n1) {
      while (p1 < n1) {
        if (p1 != 0) {
          if (arr[p1] == arr[p1 - 1]) {
            p1++;
            continue;
          }
        }
        newArr[currentP] = arr[p1++];
        currentP++;
      }
    }
    if (p2 != n2) {
      while (p2 < n2) {
        if (p2 != 0) {
          if (arr2[p2] == arr2[p2 - 1]) {
            p2++;
            continue;
          }
        }
        newArr[currentP] = arr2[p2++];
        currentP++;
      }
    }
    return newArr;
  }

  public static void findMissing(int[] arr, int n) {
    int sum = 0;
    int sumToN = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    for (int i = 0; i <= n + 1; i++) {
      sumToN += i;
    }
    int missing = sumToN - sum;
    System.out.println("The missing number is: " + missing + " ");
  }

  public static void maximumConsecutiveOne(int[] arr, int n) {
    int currentCount = 0;
    int maximumCount = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        if (currentCount > maximumCount) {
          maximumCount = currentCount;
        }
        currentCount = 0;
      } else if (arr[i] == 1) {
        currentCount += 1;
      }
    }
    if (currentCount > maximumCount) {
      maximumCount = currentCount;
    }
    System.out.println(maximumCount);
  }

  public static void findSingleOccuranceElement(int[] arr, int n) {
    // Map<Integer, Integer> allElements = new HashMap<>();
    // for (int i = 0; i < n; i++) {
    // allElements.merge(arr[i], 1, Integer::sum);
    // }
    // for (Map.Entry<Integer, Integer> entry : allElements.entrySet()) {
    // int value = entry.getValue();
    // if (value == 1) {
    // System.out.println("The single occurance Element is " + entry.getKey());
    // return;
    // }
    // }
    //
    // Optimal Approach
    int xorr = 0;
    for (int el : arr) {
      xorr ^= el;
    }
    System.out.println("The single occurance Element is " + xorr);
  }
}
