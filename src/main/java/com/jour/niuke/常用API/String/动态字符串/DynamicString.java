package com.jour.niuke.常用API.String.动态字符串;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //write your code here......
        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        for(int i = sb.length() - 1; i >= 0; i--){
            count++;
            if( count % 3 == 0 && i != 0){
                sb.insert(i, ",");
            }
        }

        System.out.println(sb);
    }

}
