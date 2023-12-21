package blind76;

import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {

    public static void main(String [] args) {

        int [] input = {1,2,4,3,1};


        System.out.println(containsDuplicate1(input));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++) {

            if(map.containsKey(nums[i])) return true;
            else
                map.put(nums[i],i);


        }
        return false;

    }
    public static boolean containsDuplicate1(int[] nums) {

       boolean visited [] = new boolean[256];
       System.out.println(visited[0]);

        for(int i=0;i<nums.length;i++) {

          if(visited[nums[i]]) return true;
          else visited[nums[i]] = true;
        }
        return false;

    }
}
