package blind76;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String [] args) {

        int a [] = {1,2,4,-2,1,0,-1,4,8,-5,3};
        List<List<Integer>> res ;
        res = getThreeSum(a);
        System.out.println(res);
    }

    private static List<List<Integer>> getThreeSum(int[] a) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(a);
        for (int i=0;i<a.length-2;i++) {

            if(i>0 && a[i]==a[i-1]) continue;

            int num2Index = i+1;
            int num3Index = a.length-1;

            while(num3Index>num2Index) {
                int sum = a[i]+a[num2Index]+a[num3Index];
                if(sum==0) {
                    res.add(Arrays.asList(a[i],a[num2Index],a[num3Index]));
                    num3Index--;
                    while (num3Index>num2Index && a[num3Index]==a[num3Index+1]) num3Index--;
                }
                else if (sum>0)
                    num3Index--;
                else
                    num2Index++;
            }
        }

        return  res;
    }
}
