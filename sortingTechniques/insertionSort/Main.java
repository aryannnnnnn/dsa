public class Main {

    public static void main(String args[]) {
        int[] inpArr = { 2, 3, 1, 4, 55, 44, 64, 223, 445, 641, 11 };
        insertionSort(inpArr);
        for (int el : inpArr) {
            System.out.println(el);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
