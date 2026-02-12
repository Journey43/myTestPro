package com.jour.niuke.异常处理;

import java.util.Scanner;

public class 判断学生成绩 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        //write your code here......

        try {
            if (score >= 0 && score <= 100) {
                System.out.println(score);
            }else {
                throw new ScoreException("分数不合法");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

class ScoreException extends Exception {

    //write your code here......

    public ScoreException(String message) {
        super(message);
    }

}