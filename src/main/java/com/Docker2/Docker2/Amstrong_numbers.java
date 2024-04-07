package com.Docker2.Docker2;

public class Amstrong_numbers {

    public static void main(String[] args) {
        for (int num = 1; num <= 200; num++) {
            int temp = num;
            int temp2 = num;
            int temp3 = num;

            int count = 0, sum = 0;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            while (temp2 > 0) {
                int last = temp2 % 10;
                sum = (int) (sum + (Math.pow(last, count)));//sum+= (Math.pow(last,count));
                temp2 = temp2 / 10;
            }
            if(temp3==sum) {
                System.out.println(temp3);
            }

        }
    }

}
