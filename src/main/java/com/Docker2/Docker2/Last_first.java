package com.Docker2.Docker2;

public class Last_first {

    public static void main(String[] args) {
        int num=1234;
        int num2=1234;
       while(num>10) {
           num = num / 10;
       }
        System.out.println( num+" first digit");
        System.out.println(num2%10 +" last digit");
    }
}
