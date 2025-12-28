public class Main {
  public static void main(String args[]) {
    System.out.println(checkpalindrome(2323));
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
}
