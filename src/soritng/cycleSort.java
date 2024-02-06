package soritng;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        sort(arr);
         System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        selectionSort s=new selectionSort();
        int i=0;
        while(i<arr.length-1){ //not for duplicate numbers
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
               s.swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
}
