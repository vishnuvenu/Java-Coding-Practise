package blind76;

import java.util.Arrays;
import java.util.HashMap;

public class CountOfKSumPairs {
    public static void main(String [] args) {

        int [] input = {1,2,4,3,1};


        System.out.println(maxOperations(input,5));
    }
    public static int maxOperations(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Arrays.sort(nums);
        int count=0;
        int left = 0;
        int right = nums.length-1;


        while(left<right) {
            if(nums[left]+nums[right]==k)  {count++; left++;right--;}
            else if (nums[left]+nums[right]>k) right--;
            else left++;
        }
        return count;

    }
}
