package com.jour.niuke.四舍五入;

import java.util.Scanner;

public class RoundOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();

        //write your code here......
        long round = Math.round(d);
        int j = Math.toIntExact(round);
        int i = (int) round;
        System.out.println(j);
        System.out.println(i);
    }
}
