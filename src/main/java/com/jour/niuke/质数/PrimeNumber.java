package com.jour.niuke.质数;

import com.sun.javaws.Main;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(isPrimeNumber(number));
    }

    public static Boolean isPrimeNumber(int number) {

        //write your code here......
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
