package com.company.day1;

public class LargestSumOfKConsecutive {

    public static void  main(String [] args) {
        int a[] = {8,3};
        System.out.println(largestSumOf(3,a));
    }

    private static int largestSumOf(int k, int[] a) {

        if (a.length>=k==false) return 0;
        int currWinSum =0;
        for(int i=0;i<k;i++) currWinSum+=a[i];
        int lsum = currWinSum;

        for(int i=k;i<a.length;i++) {
             currWinSum = currWinSum + a[i] - a[i-k];
             if (currWinSum > lsum){
                 lsum = currWinSum;
             }
        }

        return lsum;
    }
}
