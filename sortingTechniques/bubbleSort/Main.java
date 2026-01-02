public class Main {

    public static void main(String args[]) {
        int[] inpArr = {
            87,
            23,
            45,
            12,
            99,
            4,
            56,
            78,
            34,
            65,
            91,
            18,
            27,
            50,
            6,
            72,
            39,
            84,
            15,
            60,
            2,
            97,
            41,
            68,
            29,
            10,
            53,
            76,
            88,
            31,
            7,
            64,
            20,
            90,
            46,
            14,
            82,
            36,
            59,
            25,
            71,
            5,
            94,
            33,
            66,
            11,
            48,
            80,
            19,
            58,
        };
        bubbleSort(inpArr);
        for (int el : inpArr) {
            System.out.println(el);
        }
    }

    public static void bubbleSort(int[] arr) {
        Boolean swapped = true;
        int limit = 0;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1 - limit; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
            limit++;
        }
    }
}
