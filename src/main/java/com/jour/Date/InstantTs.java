package com.jour.Date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class InstantTs {
    public static void main(String[] args) {
        //时间戳 → 格式化时间
        long ts = System.currentTimeMillis();
        Instant instant = Instant.ofEpochMilli(ts);//系统时区
        String timeStr = instant.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        //任意时区

        System.out.println("时间戳 → 格式化时间:" + timeStr);


        //String → LocalDateTime → 时间戳
        String str = "2026-01-28 08:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(str, formatter);
        //（1）普通的带时区的时间
        long milli = ldt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        //（2）UTC时间
        long utcTs = ldt.toInstant(ZoneOffset.UTC).toEpochMilli();

        //(3)任意时区
        long DhakaTs = ldt.atZone(ZoneId.of("Asia/Dhaka")).toInstant().toEpochMilli();

        System.out.println("带时区的时间de时间戳:" + milli);
        System.out.println("UTC时间de时间戳:" + utcTs);
        System.out.println("Dhaka时间de时间戳:" + DhakaTs);


    }
}
