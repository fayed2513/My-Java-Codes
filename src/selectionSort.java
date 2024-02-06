import java.util.Arrays;


public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection( arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int last=arr.length-1-i;
            int maxIndex=maximum(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }

    public static void swap(int[] arr, int last, int maxIndex) {
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    public static int maximum(int[] arr,int start,int end) {
        int max=start;
        for(int i=start;i<end;i++){
            if(arr[max]<arr[i+1]){
                max=i+1;
            }
        }
return max;
    }


    public static class DuplicateNumber {
        public static void main(String[] args) {
            int[] arr = {1, 3, 4, 2, 2};
            System.out.println(findDuplicate(arr));
        }

        public static int findDuplicate(int[] arr) {
    //        boolean[] bool = new boolean[arr.length];
    //        for(int num : arr) {
    //            if(!bool[num]) {
    //                System.out.println(bool[num]);
    //                bool[num] = true;
    ////                System.out.println(bool[num]);
    //            }
    //            else {
    //                return num;
    //            }
    //        }
    //        return -1;
    //

            int i = 0;
            while (i < arr.length) {
                if (arr[i] != i + 1) {
                    int correct = arr[i] - 1;
                    if (arr[i] != arr[correct]) {
                        swap(arr, i, correct);
                    } else {
                        return arr[i];
                    }
                } else {
                    i++;
                }

            }
            return -1;
        }
            public static void swap( int[] arr, int last, int maxIndex){
                int temp = arr[last];
                arr[last] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
    }
}
