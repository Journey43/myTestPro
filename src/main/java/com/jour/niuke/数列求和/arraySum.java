package com.jour.niuke.数列求和;

public class arraySum {
    public static void main(String[] args) {

        //write your code here........
        long shu = 0;
        long sum = 0;


        for (int i = 1; i <= 10; i++) {

            long b = (long) Math.pow(10, i-1) * 9;
            shu += b ;
            sum += shu;
        }

        System.out.println(sum);

    }
}
