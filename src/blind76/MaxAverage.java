package blind76;

public class MaxAverage {


    public static void main(String [] args) {

        int [] input = {1,12,-5,-6,50,3};


        System.out.println(findMaxAverage(input,4));
    }

    public static double findMaxAverage(int[] nums, int k) {

        int maxSum=0;

        if (nums.length < k) return 0.00;

        for(int i =0;i<k;i++) maxSum+=nums[i];

        for(int i=k;i< nums.length;i++){
            int currentSum = maxSum+nums[i]-nums[i-k];
            maxSum= Math.max(currentSum,maxSum);
        }

        System.out.println(maxSum);

        return maxSum/k;

    }
}
