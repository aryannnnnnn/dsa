import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Enter the limit for array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Element: ");
            arr[i] = scanner.nextInt();
        }
        recursiveInsertionSort(arr, n - 1);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void recursiveInsertionSort(int[] arr, int limit) {
        if (limit < 1) {
            return;
        }

        recursiveInsertionSort(arr, limit - 1);

        int j = limit - 1;
        int key = arr[limit];

        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}
