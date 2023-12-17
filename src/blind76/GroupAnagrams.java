package blind76;

import java.util.*;

public class GroupAnagrams {

    public static void main(String [] args) {

        String [] input = {"eat","ate","tea","abc"};

        List<List<String>> res = getGroupAnagrams(input);
        System.out.println(res);
    }

    private static List<List<String>> getGroupAnagrams(String [] input) {
        List<List<String>> res = new ArrayList<>();

        HashMap<String,List<String>> anagrams = new HashMap<String,List<String>>();

      for(int i =0;i< input.length;i++) {

          char[] current = input[i].toCharArray();
          Arrays.sort(current);
          if(anagrams.containsKey(String.valueOf(current))){
               List<String> ana = anagrams.get(String.valueOf(current));
               ana.add(input[i]);
               anagrams.put(String.valueOf(current),ana);
          }
          else {
               ArrayList<String> a = new ArrayList<String>();
               a.add(input[i]);
               anagrams.put(String.valueOf(current), a);
          }

      }

        for(Map.Entry<String, List<String>> en:anagrams.entrySet()){
            res.add(en.getValue());
        }



        return res;

    }
}
