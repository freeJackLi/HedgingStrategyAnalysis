package com.freelxl.coin.hsa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lixiuliang on 2017/12/1.
 */
public class DateTimeUtil {


    public static String getCurrentDateTimeString() {

        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateTimeString = formater.format(new Date());

        return dateTimeString;
    }

    public static String getCurrentDateString() {

        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
        String dateString = formater.format(new Date());

        return dateString;
    }

    public static String getCurrentHourString() {

        SimpleDateFormat formater = new SimpleDateFormat("HH");
        String hourString = formater.format(new Date());

        return hourString;
    }
}
