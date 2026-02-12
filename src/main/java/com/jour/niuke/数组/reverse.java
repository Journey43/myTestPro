package com.jour.niuke.数组;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //write your code here......
        int[] arr2 = new int[6];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr2[count] = arr[i];
            count++;
        }

        System.out.println(Arrays.toString(arr2));
    }

}
