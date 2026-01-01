public class Main {
  public static void main(String args[]) {
    // System.out.println(checkPalindrome("s"));
    fibonacciSeries(5, 0, 1);
  }

  public static void printNumberOfTimes(int num) {
    System.out.println("Recursion ID: " + num--);
    if (num == 0) {
      return;
    }
    printNumberOfTimes(num);
  }

  public static void printName(int num) {
    System.out.print("Aryan  ");
    num--;
    if (num == 0) {
      return;
    }
    printName(num);
  }

  public static void print1toN(int num, int limit) {
    System.out.print(num++ + "  ");
    if (num == limit) {
      return;
    }
    print1toN(num, limit);
  }

  public static void backTrackingNto1(int num, int limit) {
    if (num == limit) {
      return;
    }
    num++;
    backTrackingNto1(num, limit);
    System.out.print(num + "  ");
  }

  public static int sumOfFirstN(int num) {
    if (num <= 0) {
      return 0;
    }
    return num + sumOfFirstN(num - 1);
  }

  public static int factorialOfN(int num) {
    if (num == 1) {
      return 1;
    }
    return num * factorialOfN(num - 1);
  }

  public static int[] reverseArrayUsingBacktracking(int num, int st, int[] arr) {
    if (num == 0) {
      return new int[arr.length];
    }
    num--;
    st++;
    int[] returnArray = reverseArrayUsingBacktracking(num, st, arr);
    returnArray[st] = arr[num];
    return returnArray;
  }

  public static int[] reverseArrayUsing2Pointers(int[] arr) {
    int p1 = 0;
    int p2 = arr.length - 1;
    while (p2 > p1) {
      int holder = arr[p1];
      arr[p1] = arr[p2];
      arr[p2] = holder;
      p2--;
      p1++;
    }
    return arr;
  }

  public static String checkPalindrome(String str) {
    int p1 = 0;
    int p2 = str.length() - 1;
    while (p2 > p1) {
      if (str.charAt(p1) != str.charAt(p2)) {
        return "Not Palindrome";
      }
      p1++;
      p2--;
    }
    return "Palindrome";
  }

  public static void fibonacciSeries(int limit, int f1, int f2) {
    if (limit == 0) {
      if (f1 == 0) {
        System.out.println(0);
      }
      return;
    }

    if (f1 == 0) {
      if (limit == 1) {
        System.out.println(0);
        return;
      } else if (limit == 2) {
        System.out.println(0 + " " + 1);
        return;
      }
      System.out.print(f1 + " " + f2 + " ");
      limit--;
    } else {
      System.out.print(Math.max(f1, f2) + " ");
    }

    if (f1 <= f2) {
      f1 = f2 + f1;
    } else {
      f2 = f1 + f2;
    }
    limit--;

    fibonacciSeries(limit, f1, f2);
  }
}
