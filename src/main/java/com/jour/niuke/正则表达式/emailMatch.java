package com.jour.niuke.正则表达式;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        //write your code here......
        Pattern compile = Pattern.compile(emailMatcher);
        Matcher matcher = compile.matcher(str);
        if(matcher.matches()){
            System.out.print("邮箱格式合法");
        }else {
            System.out.print("邮箱格式不合法");
        }

    }
}
