import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    System.out.println(checkPrime(1));
  }

  public static int countDigits(int digit) {
    int count = 0;
    while (digit > 0) {
      count++;
      digit = digit / 10;
    }
    return count;
  }

  public static int reverseDigit(int digit) {
    int reversedNumber = 0;
    while (digit > 0) {
      int lastDigit = digit % 10;
      digit = (digit - lastDigit) / 10;
      reversedNumber = (reversedNumber * 10) + lastDigit;
    }
    return reversedNumber;
  }

  public static Boolean checkpalindrome(int num) {
    int reversedNumber = 0;
    int originalNumber = num;
    while (num > 0) {
      int lastDigit = num % 10;
      num = num / 10;
      reversedNumber = (reversedNumber * 10) + lastDigit;
    }
    if (originalNumber == reversedNumber) {
      return true;
    }
    return false;
  }

  public static int findGCD(int num1, int num2) {
    // int minNum = Math.min(num1, num2);
    // for (int i = minNum; i > 0; i--) {
    // if (num2 % i == 0) {
    // if (num1 % i == 0) {
    // return i;
    // }
    // }
    // }
    // return 1;
    while (num2 != 0) {
      int remainder = num1 % num2;
      num1 = num2;
      num2 = remainder;
    }
    return num1;
  }

  public static String checkArmstrong(int num) {
    int numOfDigit = (int) Math.log10(num) + 1;
    int afterTotal = 0;
    int beforeTotal = num;
    while (num > 0) {
      afterTotal += (int) Math.pow(num % 10, numOfDigit);
      num = num / 10;
    }
    if (afterTotal == beforeTotal) {
      return "True";
    }
    return "False";
  }

  public static List<Integer> findDivisors(int num) {
    // brute force
    // List<Integer> divisors = new ArrayList<>();
    // int start = 0;
    // if (num % 2 == 0) {
    // start = num / 2;
    // } else {
    // start = num / 3;
    // }
    // for (int i = 1; i <= start; i++) {
    // if (num % i == 0) {
    // divisors.add(i);
    // }
    // }
    // divisors.add(num);
    // return divisors;
    //
    // optimal
    List<Integer> divisors = new ArrayList<>();
    int sqrtOfNum = (int) Math.sqrt(num);
    for (int i = 1; i <= sqrtOfNum; i++) {
      if (num % i == 0) {
        int result = num / i;
        divisors.add(result);
        divisors.add(i);
      }
    }
    divisors.removeLast();
    return divisors;
  }

  public static Boolean checkPrime(int num) {
    if (num == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
