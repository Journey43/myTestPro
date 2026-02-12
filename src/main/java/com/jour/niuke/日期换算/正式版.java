package com.jour.niuke.日期换算;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class 正式版 {
    public static void main(String[] args) {
        String str1 = "1422 4 5 19 24 43";

        String[] split = str1.trim().split("\\s+");
        if (split.length < 6) {
            System.out.println("您输入的数据不合理");
            return;
        }

        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        int hour = Integer.parseInt(split[3]);
        int minute = Integer.parseInt(split[4]);
        int second = Integer.parseInt(split[5]);

        // 这就是你输入的“北京时间墙上时间”
        LocalDateTime ldt = LocalDateTime.of(year, month, day, hour, minute, second);

        // ✅ 固定“北京时间 = UTC+8”，不要用 Asia/Shanghai（避免 1422 年的历史 +08:05:43）
        Instant instant = ldt.toInstant(ZoneOffset.ofHours(8));
        Date date = Date.from(instant);

        // ✅ SimpleDateFormat 固定用 GMT+08:00，并且强制永远使用 Gregorian（避免 1422 年的 9 天偏差）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        TimeZone tzBjFixed = TimeZone.getTimeZone("GMT+08:00");
        sdf.setTimeZone(tzBjFixed);

        GregorianCalendar cal = new GregorianCalendar(tzBjFixed);
        cal.setGregorianChange(new Date(Long.MIN_VALUE)); // 永远用 Gregorian
        sdf.setCalendar(cal);

        String cn = sdf.format(date);
        System.out.println("北京时间为：" + cn);

        // 纽约时间：按你要求固定减 12 小时（不改）
        Date date_ny = new Date(date.getTime() - 12L * 60 * 60 * 1000);
        String ny = sdf.format(date_ny);
        System.out.println("纽约时间为：" + ny);
    }
}
