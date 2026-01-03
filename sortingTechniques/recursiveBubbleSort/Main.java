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
        recursiveBubbleSort(arr, n - 1, 0, false);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static boolean recursiveBubbleSort(
        int[] arr,
        int n,
        int counter,
        boolean swapped
    ) {
        if (counter > n) {
            return true;
        }

        swapped = recursiveBubbleSort(arr, n, counter + 1, swapped);

        if (swapped == false) {
            return false;
        }

        swapped = false;

        for (int i = 0; i <= counter - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }

        return swapped;
    }
}
