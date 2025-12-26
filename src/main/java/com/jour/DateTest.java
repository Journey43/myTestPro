package com.jour;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class DateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);

        int currentYear = now.getYear();
        System.out.println("当前时间的年份: " + currentYear);

        LocalDate date = LocalDate.of(2025, 3, 18); // 指定日期
        System.out.println("date: " + date);
        LocalDate parse = LocalDate.parse("2025-03-18");
        System.out.println("paese: " + parse);

        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow  = today.plusDays(1);

        LocalDate lastMonth = today.minusMonths(1);
        LocalDate nextYear  = today.plusYears(1);

        System.out.println("昨天: " + yesterday + "    " + "明天: " + tomorrow);
        System.out.println("上个月: " + lastMonth + "  "+ "下一年: " + nextYear);

        //年
        int year  = today.getYear();
        System.out.println("今日所处年份的数字: " + year);

        //月
        System.out.println("今日所处月份的数字: " + today.getMonthValue());
        System.out.println("今日所处月份的英文: " + today.getMonth());

        //日
        System.out.println("今日在月中的号数字： " + today.getDayOfMonth());
        System.out.println("今日在一周中的周号英文: " + today.getDayOfWeek());
        System.out.println("今日在一年中的天号: " + today.getDayOfYear());

        LocalDate lastDay = today.with(
                TemporalAdjusters.lastDayOfMonth()
        );
        System.out.println("当前月的最后一天： " + lastDay);


        System.out.println("今天的开始时间点： " + today.atStartOfDay());


        //时区
        ZonedDateTime nowCn = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        LocalDate localDateCN = nowCn.toLocalDate();
        LocalDateTime localDateTimeCN = nowCn.toLocalDateTime();
        System.out.println("中国(带时区)： " + nowCn); //2025-12-19T14:10:56.340+08:00[Asia/Shanghai]
        System.out.println(localDateCN);//2025-12-19
        System.out.println(localDateTimeCN);//2025-12-19T14:10:56.340

        ZonedDateTime nowUs = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("美国(带时区)： " + nowUs);
        LocalDate localDateUS = nowUs.toLocalDate();
        LocalDateTime localDateTimeUS = nowUs.toLocalDateTime();
        System.out.println(localDateUS);
        System.out.println(localDateTimeUS);

        //日期差（年/月/日）
        Period period = Period.between(localDateCN, localDateUS);
        System.out.println("period: " + period);
        System.out.println("period.getDays(): " + period.getDays());
        System.out.println("period.getMonths(): "  + period.getMonths());
        //nowUs与nowCn两地时间点所对应时间戳是相同的，所以是同一时刻
        System.out.println(Duration.between(nowUs, nowCn));//非时差

        int diffSeconds = nowCn.getOffset().getTotalSeconds() - nowUs.getOffset().getTotalSeconds();//时差
        System.out.println("时差： "  + diffSeconds);


        //所有时区
        /*Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);*/

    }
}
