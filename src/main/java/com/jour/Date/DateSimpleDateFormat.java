package com.jour.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String result = sdf.format(now);
        System.out.println("未格式化前：" + now);
        System.out.println("格式化后：" + result);


        //字符串 格式化成 日期Date
        String str = "2026-01-28 08:30:00";
        Date date = sdf.parse(str);
        System.out.println("字符串 格式化成 日期:" + date);
    }
}
