package blind76;

import java.util.HashMap;

public class TwoSum {

    public static void main(String [] args) {

        int a [] = {1,2,3,4,5,3};
        int res [] = twoSum(a,8);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int [] twoSum(int [] a, int target) {

        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++) {
             int c = a[i];
             int x = target - c;
             if(map.containsKey(x)) return new int [] {map.get(x),i};
             else map.put(c,i);
        }


        return null;
    }
}
//Algorithm
//
//        It turns out we can do it in one-pass. While we are iterating and inserting elements into the hash table,
//        we also look back to check if current element's complement already exists in the hash table. If it exists,
//        we have found a solution and return the indices immediately.
//
//        Implementation
//
//
//        Complexity Analysis
//
//        Time complexity: O(n)O(n)O(n).
//        We traverse the list containing nnn elements only once. Each lookup in the table costs only O(1)O(1)O(1) time.
//
//        Space complexity: O(n)O(n)O(n).
//        The extra space required depends on the number of items stored in the hash table, which stores at most nnn elements.