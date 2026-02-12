package com.jour.niuke.死循环;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long count = 0;
        while (true){
            int a = scanner.nextInt();
           if (a <= 0){
               break;
           }
           count++;
        }
        System.out.println(count);

    }
}
