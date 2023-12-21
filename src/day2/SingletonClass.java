package day2;

import java.util.Arrays;

public class SingletonClass {


    public static void main(String[] args) {
         B b = new B();
         //String [] dd ="https://abc/con/10049100/prod/10086179?vId=10088930".split("/|\\?|\\=");
       // Arrays.stream(dd).forEach(System.out::println);
        String a = "askdhk";

        int [] aa = new int[128];
        for (int i =0;i<a.length();i++) {
            aa[a.charAt(i)] = aa[a.charAt(i)]+1;
        }

        for (int i =0;i< 128;i++) {
           System.out.println((char)i+ ": " +aa[i] );
        }
    }

    static class B{
        private B() {
            System.out.println(" this is from private C");
        }
    }
}
