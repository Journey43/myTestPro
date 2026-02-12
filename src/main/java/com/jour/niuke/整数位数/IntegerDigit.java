package com.jour.niuke.整数位数;

import java.util.Scanner;

public class IntegerDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //write code here......
        if(num > 0){
            System.out.println(String.valueOf(num).length());
        }else {
            System.out.println(num);
        }

    }
}
