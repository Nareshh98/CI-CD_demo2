package com.Docker2.Docker2;

public class Palindrome {

    public static void main(String[] args) {

        int n=121;
        int temp;
        int sum=0;

        while(n>0){

            temp=n%10;

            System.out.println(temp);
            sum=(sum*10)+temp;
              n=n/10;
            System.out.println(n);

        }
        System.out.println(sum);

        if(sum==121) {
            System.out.println(" palindrom");
        }
        else{
            System.out.println(" not a palindrom");

        }

    }

}
