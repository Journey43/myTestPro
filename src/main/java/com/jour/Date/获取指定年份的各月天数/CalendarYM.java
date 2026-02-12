package com.jour.Date.获取指定年份的各月天数;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;

public class CalendarYM {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //不进行set，则是当前日期

        int year = 2023;
        cal.set(Calendar.YEAR, year);

        for(int month = Calendar.JANUARY; month<=Calendar.DECEMBER;month++){
            cal.set(Calendar.MONTH, month);
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(year + "年" + (month + 1) + "月:" + days + "天");

        }

        //使用YearMonth
        System.out.println("===============使用YearMonth===================");

        for (int month = 1; month <= 12; month++) {
            YearMonth ym = YearMonth.of(year, month);
            int days = ym.lengthOfMonth();
            System.out.println(year + "年" + (month + 1) + "月:" + days + "天");
        }

        System.out.println("===============使用LocalDate===================");
        /*
        * 原理：
            先定位到 该月 1 号,再用 lengthOfMonth() 拿该月真实天数*/
        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 1);
            int days = date.lengthOfMonth();
            System.out.println(year + "年" + (month + 1) + "月:" + days + "天");
        }
    }
}
