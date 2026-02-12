package com.jour.niuke.日期换算;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DateToPlus {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner in = new Scanner(System.in);
        String str1 ="2134 9 92 16 00 00"; //in.nextLine();

        //write your code here......  2021 09 08 14 38 05
        String[] split = str1.split(" ");
        if(split.length < 6){
            System.out.println("您输入的数据不合理");
        }else {
            int year = Integer.valueOf(split[0]);
            int month = Integer.valueOf(split[1]);
            int day = Integer.valueOf(split[2]);
            int hour = Integer.valueOf(split[3]);
            int minute = Integer.valueOf(split[4]);
            int second = Integer.valueOf(split[5]);

            //保证是正确的月
            if (month > 12) {
                int yearOut = month / 12;
                year += yearOut;
                month = month - 12 * yearOut;
            }

            YearMonth yearMonth = YearMonth.of(year, month);
            int lengthOfMonth = yearMonth.lengthOfMonth();
            while (day > lengthOfMonth) {
                int dayOut = day / lengthOfMonth;
                day = day - lengthOfMonth;
                month += dayOut;
                if (month > 12) {
                    int yearOut = month / 12;
                    year += yearOut;
                    month = month - 12 * yearOut;
                }
                yearMonth = YearMonth.of(year, month);
                lengthOfMonth = yearMonth.lengthOfMonth();
            }

            //北京时间为：
            LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);//2021-09-08T14:38:05

            //根据指定时区，把localDateTime转换成对应的时间戳。再把时间戳转成UTC 时间点Date
            Date date = Date.from(localDateTime.atZone(ZoneId.of("Asia/Shanghai")).toInstant());//Wed Sep 08 14:38:05 CST 2021

            //决定“这个时间点如何被格式化显示”   这一步只影响sdf.format(date)
            sdf.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
            //如果 系统时区就是上海，
            //这时 setTimeZone(Asia/Shanghai) 确实可以省略（不是逻辑重复，而是默认一致）

            //把utc时间根据sdf转成对应(setTimeZone)时区的时间字符串
            String format = sdf.format(date);//2021-09-08 14:38:05
            System.out.println("北京时间为：" + format);

            //纽约时间为：
        /*
        * 纽约（America/New_York）
            有夏令时（DST）两种情况：
                冬令时：EST = UTC-5 ⇒ 与中国差 13 小时（8 - (-5) = 13）

                夏令时：EDT = UTC-4 ⇒ 与中国差 12 小时（8 - (-4) = 12）*/
            //sdf.setTimeZone(java.util.TimeZone.getTimeZone("America/New_York"));
            //String format2 = sdf.format(date);//2021-09-08 14:38:05

            //固定12小时
            Date date_ny = new Date(date.getTime() - 12L * 60 * 60 * 1000);
            String time_ny = sdf.format(date_ny);

            System.out.println("纽约时间为：" + time_ny);
        }
    }

}
