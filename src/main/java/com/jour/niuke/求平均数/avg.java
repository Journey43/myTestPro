package com.jour.niuke.求平均数;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write your code here......
        int count = 0;
        double sum = 0;
        while (true){
            double value = scan.nextDouble();
            if (value < 0) break;

            sum += value;
            count++;
        }

        //  a/b 只要a和b有一个是double就不会丢失精度

        double avg = sum / count;
        System.out.println(String.format("%.2f",avg));
        //输出格式为：System.out.println(String.format("%.2f",avg));


    }
}
