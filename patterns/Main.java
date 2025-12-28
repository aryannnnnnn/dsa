public class Main {

  public static void main(String[] args) {
    // blockStar();
    // stairsStar();
    // stairsNumbers();
    // stairsRepeatedNumbers();
    // revertedStars();
    // pyramidStart(11);
    // reversePyramidStart(11);
    // diamond(11);
    // arrow();
    // boolStairs();
    // doubleIdenticalStair(8);
    // continuousNumberStair(5);
    // abcdStair(5);
    // reverseAbcdStair(5);
    // staticAbcdStair(5);
    // triangleAbcd(11);
    // staticDescAbcStairs(5);
    // invertedDiamond(11);
    // reverseInvertedDiamond(11);
    // emptybox(11);
    numericCube(4);
  }

  public static void blockStar() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  public static void stairsStar() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  public static void stairsNumbers() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1);
      }
      System.out.print("\n");
    }
  }

  public static void stairsRepeatedNumbers() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1);
      }
      System.out.print("\n");
    }
  }

  public static void revertedStars() {
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.print("\n");
    }
  }

  public static void pyramidStart(int limit) {
    int midPoint = (int) Math.ceil((float) limit / 2);
    for (int i = 0; i < midPoint; i++) {
      for (int j = 1; j <= limit; j++) {
        if (midPoint - i <= j && j <= midPoint + i) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void reversePyramidStart(int limit) {
    int midPoint = (int) Math.ceil((float) limit / 2);
    for (int i = midPoint - 1; i >= 0; i--) {
      for (int j = 1; j <= limit; j++) {
        // System.out.println("limit" + limit + "midPoint" + midPoint);
        if (midPoint - i <= j && j <= midPoint + i) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void diamond(int limit) {
    int midPoint = (int) Math.ceil((float) limit / 2);
    for (int i = 0; i < midPoint; i++) {
      for (int j = 1; j <= limit; j++) {
        if (midPoint - i <= j && j <= midPoint + i) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
    for (int i = midPoint - 1; i >= 0; i--) {
      for (int j = 1; j <= limit; j++) {
        // System.out.println("limit" + limit + "midPoint" + midPoint);
        if (midPoint - i <= j && j <= midPoint + i) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void arrow() {
    int a = 0;
    for (int i = 0; i < 10; i++) {
      boolean switchVar = i < 5;
      if (switchVar) {
        a++;
      } else {
        a--;
      }
      for (int j = 0; j < a; j++) {
        // System.out.println(a);
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  public static void boolStairs() {
    int b = 1;
    for (int i = 1; i <= 5; i++) {
      b = i % 2;
      for (int j = 1; j <= i; j++) {
        System.out.print(b);
        b = b ^ 1;
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void doubleIdenticalStair(int numLimit) {
    int midPoint = numLimit / 2;
    for (int i = 1; i <= midPoint; i++) {
      for (int l = 1; l <= i; l++) {
        System.out.print(l);
      }
      for (int s = 1; s <= numLimit - (i * 2); s++) {
        System.out.print(" ");
      }
      for (int r = i; r >= 1; r--) {
        System.out.print(r);
      }
      System.out.print("\n");
    }
  }

  public static void continuousNumberStair(int Num) {
    int count = 1;
    for (int i = 1; i <= Num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count++ + " ");
      }
      System.out.print("\n");
    }
  }

  public static void abcdStair(int num) {
    for (int i = 0; i < num; i++) {
      char character = 'A';
      for (int j = 0; j <= i; j++) {
        System.out.print(character++);
      }
      System.out.print("\n");
    }
  }

  public static void reverseAbcdStair(int num) {
    for (int i = num; i > 0; i--) {
      char character = 'A';
      for (int j = 0; j < i; j++) {
        System.out.print(character++);
      }
      System.out.println();
    }
  }

  public static void staticAbcdStair(int num) {
    char character = 'A';
    for (int i = 0; i < num; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(character);
      }
      character++;
      System.out.println();
    }
  }

  public static void triangleAbcd(int num) {
    int midPoint = (int) Math.ceil((float) num / 2);
    for (int i = 0; i < midPoint; i++) {
      char character = 'A';
      for (int j = 1; j <= num; j++) {
        if (midPoint - i <= j && j <= midPoint + i) {
          if (j < midPoint) {
            System.out.print(character);
            character++;
          } else {
            System.out.print(character);
            character--;
          }
        } else {
          System.out.print(' ');
        }
      }
      System.out.println();
    }
  }

  public static void staticDescAbcStairs(int num) {
    char character = (char) ('A' + num);
    for (int i = 1; i <= num; i++) {
      character -= i;
      for (int j = 1; j <= i; j++) {
        System.out.print(character++);
        System.out.print(' ');
      }
      System.out.println();
    }
  }

  public static void invertedDiamond(int limit) {
    int midPoint = (int) Math.ceil((float) limit / 2);
    for (int i = 0; i < midPoint; i++) {
      for (int j = 1; j <= limit; j++) {
        if (midPoint - i < j && j < midPoint + i) {
          System.out.print(" ");
        } else {
          System.out.print("x");
        }
      }
      System.out.print("\n");
    }
    for (int i = midPoint - 1; i >= 0; i--) {
      for (int j = 1; j <= limit; j++) {
        if (midPoint - i < j && j < midPoint + i) {
          System.out.print(" ");
        } else {
          System.out.print("x");
        }
      }
      System.out.print("\n");
    }
  }

  public static void reverseInvertedDiamond(int limit) {
    int midPoint = (int) Math.ceil((float) limit / 2);
    for (int i = midPoint - 1; i >= 0; i--) {
      for (int j = 1; j <= limit; j++) {
        if (midPoint - i < j && j < midPoint + i) {
          System.out.print(" ");
        } else {
          System.out.print("x");
        }
      }
      System.out.print("\n");
    }
    for (int i = 1; i < midPoint; i++) {
      for (int j = 1; j <= limit; j++) {
        if (midPoint - i < j && j < midPoint + i) {
          System.out.print(" ");
        } else {
          System.out.print("x");
        }
      }
      System.out.print("\n");
    }
  }

  public static void emptybox(int num) {
    int midpoint = (num + 1) / 2;
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 1) {
        for (int j = 1; j <= midpoint; j++) {
          if (j == 1 || j == midpoint || i == 1 || i == num) {
            System.out.print('x');
          } else {
            System.out.print(' ');
          }
        }
        System.out.println();
      } else {
        System.out.println();
      }
    }
  }

  public static void numericCube(int input) {
    int size = (input * 2) - 1;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        int top = i;
        int left = j;
        int right = size - 1 - j;
        int bottom = size - 1 - i;

        int minDistance = Math.min(
            Math.min(top, bottom),
            Math.min(left, right));

        System.out.print(input - minDistance + " ");
      }
      System.out.println();
    }
  }
}
