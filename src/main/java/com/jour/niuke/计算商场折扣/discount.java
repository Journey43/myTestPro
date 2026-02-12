package com.jour.niuke.计算商场折扣;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;

        if(price < 500 && price >= 100){
            cost = (int)((double)price * 0.9);
        } else if (price < 2000 && price >=500) {
            cost = (int)((double)price * 0.8);
        }else if (price < 5000 && price >=2000) {
            cost = (int)((double)price * 0.7);
        }else if (price >= 5000) {
            cost = (int)((double)price * 0.6);
        }else {
            cost = price;
        }

        //write your code here......


        System.out.println(cost);
    }
}
