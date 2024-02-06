package soritng;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,3,1,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
//        for (int i = 0; i < arr.length-1; i++) {
//            boolean noSwap = true;
//            for (int j = 0; j < (arr.length-1) - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    noSwap = false;
//                }
//
//            }
//            if (noSwap) {
//                break;
//            }
//        }
        for (int i = 0; i < arr.length-1; i++) {
            boolean noSwap = true;
            for (int j = 1; j < arr.length- i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    noSwap = false;
                }

            }
            if (noSwap) {
                break;
            }
        }
    }
}
