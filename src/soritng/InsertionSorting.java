package soritng;

import java.util.Arrays;

public class InsertionSorting {

    public static void main(String[] args) {
        //
        int[] arr = {1, 2, 3, 4, 5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
        selectionSort s = new selectionSort();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    s.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

}
