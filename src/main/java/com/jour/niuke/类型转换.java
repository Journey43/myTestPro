package com.jour.niuke;



import com.sun.javaws.Main;

import java.util.Scanner;

public class 类型转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(类型转换.typeConversion(d));
    }
    public static int typeConversion(double d){
        Integer i = (int)d;
        return i;
    }
}
