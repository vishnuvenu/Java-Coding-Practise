package com.company.day1;

public class StringCount {
    public static void main(String [] args) {
        String str = "ssssdg";
        System.out.println(getStringCount(str));

    }

    public static  String getStringCount(String str) {
        StringBuilder res = new StringBuilder();
          char prev = str.charAt(0);
          int count =1;
         for(int i=1;i<str.length();i++) {
             if(str.charAt(i)== prev){
                 count++;
             }
             else {
                 res.append(prev);
                 if(count>1)res.append(count);
                 prev =str.charAt(i);
                 count=1;
             }
         }

         res.append(prev);
        if(count>1)res.append(count);


        return res.toString();
    }
}
