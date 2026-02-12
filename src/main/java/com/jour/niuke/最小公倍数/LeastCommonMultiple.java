package com.jour.niuke.最小公倍数;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        //思路：m,n，从max(m,n)到m*n之间找最小公倍数
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);

    }

    public static int getCM(int m, int n){
        //write your code here......
        int max = Math.max(m, n);
        int lcm = 0;

        for(int i = max; i <= m*n; i++){
            if(i % m == 0 && i % n == 0){
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
