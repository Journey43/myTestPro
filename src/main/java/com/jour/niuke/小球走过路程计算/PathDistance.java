package com.jour.niuke.小球走过路程计算;

import java.util.Scanner;

public class PathDistance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h = scanner.nextFloat();
        int n = scanner.nextInt();
        float sum = 0;

        //write your code here......
        for (int i = 1; i <= n; i++) {
            sum += h + h/2;
            h = h/2;
            if(i == n){
                sum -= h;
            }
        }
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
        //输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));

    }
}
