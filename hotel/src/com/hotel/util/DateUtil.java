package com.hotel.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author xu
 * 日期工具类
 * 具体解决日志类型转换问题
 */
public class DateUtil {
    /**
     * 根据指定参数，获得时间对象
     * @param year 年
     * @param month 月
     * @param day 日
     * @return Date类型的时间对象
     */
    public static Date getDate(String year,String month,String day){
        int y=Integer.valueOf(year);
        int m=Integer.valueOf(month);
        int d=Integer.valueOf(day);
        Calendar calendar=Calendar.getInstance();
        calendar.set(y,m-1,d);//日历函数从0开始计数，0位一月 所以减一
        Date date=calendar.getTime();
        return date;
    }

}
