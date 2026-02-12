package com.jour.niuke.Ascii码;

import java.util.Scanner;

public class AsciiTest {
    public static void main(String[] args) {
        int numbers = 0;
        int words = 0;
        int space = 0;
        int other = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //！@#￥% asdyuihj 345678

        //write your code here......
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int asc = charArray[i];
            if(asc >= 65 && asc <= 90) {
                words++;
            }else if(asc >= 97 && asc <= 122) {
                words++;
            }else if(asc >= 48 && asc <= 57) {
                numbers++;
            }else if(asc == 32) {
                space++;
            }else {
                other++;
            }
        }


        System.out.println("英文字母"+words+"数字"+numbers+"空格"+space+"其他"+other);
    }
}
