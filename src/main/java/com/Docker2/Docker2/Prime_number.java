package com.Docker2.Docker2;

public class Prime_number {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
            count=0;
        }
    }
}
