import java.util.Arrays;
//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 2};
        System.out.println(missingNumber(nums));

    }
    public static int missingNumber(int[] nums) {
//        int sum = 0;
//
//        for (int i=1; i<= nums.length; i++)
//            sum += i;
//
//        for (int i=0; i< nums.length; i++)
//            sum -= nums[i];
//
//        return sum;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }

        return ((n*(n+1))/2)-sum;
    }

//    public static int missingNumber(int[] nums) {
//        selectionSort s = new selectionSort();
//        int i = 0;
//        while (i < nums.length) {
//            int correct = nums[i];
//            if (nums[i] != nums[correct] && correct != nums.length) {
//                s.swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//        return number(nums);
//    }
//
//    public static int number(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//        return nums.length;
//    }
}
