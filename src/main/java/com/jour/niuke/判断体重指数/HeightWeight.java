package com.jour.niuke.判断体重指数;

import java.util.Scanner;

public class HeightWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        //write your code here......
        double index = weight/(height * height);
        if(index < 18.5){
            System.out.print("偏瘦");
        } else if (index >=18.5 && index < 20.9) {
            System.out.print("苗条");
        } else if (index >=20.9 && index <= 24.9) {
            System.out.print("适中");
        } else if (index > 24.9) {
            System.out.print("偏胖");
        }


    }
}
