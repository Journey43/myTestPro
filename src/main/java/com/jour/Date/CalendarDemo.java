package com.jour.Date;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cal = Calendar.getInstance();
        // 获取年
        int year = cal.get(Calendar.YEAR);
        // 获取月
        int month = cal.get(Calendar.MONTH) + 1;
        // 获取日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        /*int year  = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);        // ⚠️ 0~11
        int day   = cal.get(Calendar.DAY_OF_MONTH);
        int hour  = cal.get(Calendar.HOUR_OF_DAY);  // 0~23
        int min   = cal.get(Calendar.MINUTE);
        int sec   = cal.get(Calendar.SECOND);*/

        // 使用add方法
        cal.add(Calendar.DAY_OF_MONTH, 2); // 加2天
        cal.add(Calendar.YEAR, -3); // 减3年
        // 获取年
        year = cal.get(Calendar.YEAR);
        // 获取月
        month = cal.get(Calendar.MONTH) + 1;
        // 获取日
        dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");


    }
}
