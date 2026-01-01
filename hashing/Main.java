public class Main {
  public static void main(String args[]) {
    int[] inpArr = { 1, 2, 2, 1, 2, 3, 4, 5, 4, 3, 6, 8, 3, 4 };
    // int[] outArr = countFrequency(inpArr);
    // for (int i = 0; i < outArr.length; i++) {
    // if (outArr[i] != 0) {
    // System.out.println(i + " " + outArr[i]);
    // }
    // }
    highLowFreq(inpArr);
  }

  public static int[] countFrequency(int[] arr) {
    int[] freq = new int[arr.length];
    for (int el : arr) {
      freq[el]++;
    }
    return freq;
  }

  public static void highLowFreq(int[] arr) {
    int[] freq = new int[arr.length];
    int highf = 0, lowf = 0, high = 0, low = 0;
    for (int el : arr) {
      freq[el]++;
    }

    for (int i = 0; i < freq.length; i++) {
      if (freq[i] != 0) {
        if (highf == 0 && lowf == 0) {
          highf = freq[i];
          lowf = freq[i];
        }
        if (highf < freq[i]) {
          high = i;
          highf = freq[i];
        } else if (lowf > freq[i]) {
          low = i;
          lowf = freq[i];
        }
      }
    }
    System.out.println(high + " " + low);
  }
}
