package com.jour.niuke.数组;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }

        //write your code here......
        max = ary[0];
        min = ary[0];
        for (int i : ary) {
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }

        System.out.println(max+" "+min);
    }
}

