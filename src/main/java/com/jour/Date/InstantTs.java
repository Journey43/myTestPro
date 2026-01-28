package com.jour.Date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstantTs {
    public static void main(String[] args) {
        //时间戳 → 格式化时间
        long ts = System.currentTimeMillis();
        Instant instant = Instant.ofEpochMilli(ts);
        String timeStr = instant.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("时间戳 → 格式化时间" + timeStr);


        //String → LocalDateTime → 时间戳
        String str = "2026-01-28 08:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(str, formatter);
        long milli = ldt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("时间戳" + milli);


    }
}
