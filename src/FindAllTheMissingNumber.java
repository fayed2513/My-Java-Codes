import java.util.ArrayList;
import java.util.List;

public class FindAllTheMissingNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(nums));
    }
    public static List<Integer> missingNumber(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct] ) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }


        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != (index+1)) {
                arr.add(index+1);
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int last, int maxIndex) {
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    //https://leetcode.com/problems/first-missing-positive/submissions/1146298693/
    public static class firstMissingPositive {
        public static void main(String[] args) {
            int[] nums = {3,4,-1,1};
            System.out.println(firstMissingPositive(nums));
        }
        public static int firstMissingPositive(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i]-1;
                if (nums[i]>-1&&nums[i] <= nums.length && nums[i] != nums[correct] ) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != (index+1)) {
                    return index+1;
                }
            }
            return nums.length+1;
        }
        public static void swap( int[] arr, int last, int maxIndex){
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static class FindAllDuplicateElement {
        public static void main(String[] args) {
            int[] nums = {1,2,2,4};
            System.out.println(findDuplicates(nums));
        }
        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> arr=new ArrayList<>();
            int i=0;
            while (i<nums.length){
                    int correct=nums[i]-1;
                    if(nums[i]!=nums[correct]){
                        swap(nums,i,correct);
                    }
                else{
                    i++;
                }

            }
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != (index+1)) {
                    arr.add(nums[index]);
                }
            }
    return arr;


        }
        public static void swap( int[] arr, int last, int maxIndex){
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

    }
}
//public class FindAllTheMissingNumber {
//    public static void main(String[] args) {
//        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(missingNumber(nums));
//    }
//    public static List<Integer> missingNumber(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            int correct = nums[i]-1;
//            if (i != correct && correct != nums.length) {
//                swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        List<Integer> arr=new ArrayList<>();
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] != (index+1)) {
//                arr.add(index+1);
//            }
//        }
//        return arr;
//    }
//
//    public static void swap(int[] arr, int last, int maxIndex) {
//        int temp=arr[last];
//        arr[last]=arr[maxIndex];
//        arr[maxIndex]=temp;
//    }
//}
//
