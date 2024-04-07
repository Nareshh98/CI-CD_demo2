package com.Docker2.Docker2;

public class Amstrong {

    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int count = 0,sum=0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        while(temp>0){
         int last=temp%10;
           sum= (int) (sum+ (Math.pow(last,count)));//sum+= (Math.pow(last,count));
            System.out.println();
            temp=temp/10;
        }
        System.out.println(sum);

    }

}
