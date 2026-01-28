package com.jour.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //LocalDateTime → String
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String result1 = formatter.format(now);
        String result2 = now.format(formatter);
        System.out.println("LocalDateTime → String:" + result1);
        System.out.println("LocalDateTime → String:" + result2);

        //String → LocalDateTime
        String str = "2026-01-28 08:30:00";
        LocalDateTime time = LocalDateTime.parse(str, formatter);
        System.out.println("String → LocalDateTime:" + time);

    }

}
