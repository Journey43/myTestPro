package com.jour.niuke.日期换算;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class niuke {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner in = new Scanner(System.in);
        String str1 = "1422 4 5 19 24 43";

        //write your code here......
        String[] arr = str1.split(" ");
        if(arr.length < 6){
            System.out.println("您输入的数据不合理");
        }else {
            String str = arr[0]+"-"+arr[1]+"-"+arr[2]+" "+arr[3]+":"+arr[4]+":"+arr[5];

            Date date = sdf.parse(str);//此处date是utc时间

            System.out.println("北京时间为：" + sdf.format(date.getTime()));
            System.out.println("纽约时间为：" + sdf.format(date.getTime() - (long)12* 60 * 60 * 1000));
        }
    }

}
