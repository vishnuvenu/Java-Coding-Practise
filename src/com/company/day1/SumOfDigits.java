package com.company.day1;

public class SumOfDigits {
    public static void main(String [] args) {

        int a = 154588;
        System.out.println(isSumEven(a));

    }
    public static boolean isSumEven(int a ){

        int sum = 0;
        while(a>0) {
            sum = sum + a%10;
            a=a/10;
            if(a==0 && sum>10){
                a=sum;
                sum=0;}
        }

        System.out.println(sum);
        return sum%2==0;
    }
}
