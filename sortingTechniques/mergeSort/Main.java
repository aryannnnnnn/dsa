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
        mergeSort(arr, n, 0, n - 1);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void mergeSort(int[] arr, int n, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        // devide on the way in
        mergeSort(arr, n, start, mid);
        mergeSort(arr, n, mid + 1, end);

        // merge in the way out
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int[] tmp = new int[end - start + 1];
        int iteratee = 0;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                tmp[iteratee] = arr[left];
                iteratee++;
                left++;
            } else {
                tmp[iteratee] = arr[right];
                iteratee++;
                right++;
            }
        }

        while (left <= mid) {
            tmp[iteratee] = arr[left];
            iteratee++;
            left++;
        }

        while (right <= end) {
            tmp[iteratee] = arr[right];
            iteratee++;
            right++;
        }

        for (int el : tmp) {
            arr[start] = el;
            start++;
        }
    }
}
