package com.jour.Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //LocalDateTime → String
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LocalDateTime原始：" + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //与SimpleDateFormat不同，DateTimeFormatter会返回新对象formatter2，原来的对象formatter本身并没有改变
        DateTimeFormatter formatter2 = formatter.withZone(ZoneId.of("America/New_York"));

        String result1 = formatter.format(now);
        String result2 = now.format(formatter);
        String result3 = formatter2.format(now);
        System.out.println("LocalDateTime → String:" + result1);
        System.out.println("LocalDateTime → String:" + result2);
        System.out.println("LocalDateTime → String:" + result3);

        //String → LocalDateTime
        String str = "2026-01-28 08:30:00";
        LocalDateTime time = LocalDateTime.parse(str, formatter);
        System.out.println("String → LocalDateTime:" + time);

    }

}
