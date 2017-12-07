package com.freelxl.coin.hsa.parser;

import com.freelxl.coin.hsa.bean.DepthData;
import com.freelxl.coin.hsa.conf.HSAConfig;
import com.freelxl.coin.hsa.utils.DateTimeUtil;

import java.util.Calendar;
import java.util.Date;

public abstract class DepthDataParserAdapter implements DepthDataParser {

    public DepthData parse(String message) {

        String startDateString = message.substring(0, HSAConfig.TIME_STRING_LENGTH);
        String endDateString = message.substring(HSAConfig.TIME_STRING_LENGTH + HSAConfig.START_END_DATE_DIVIDER.length(), HSAConfig.TIME_LOG_LENGTH);
        Calendar startCalendar = DateTimeUtil.getCalendarFromDateString(startDateString);
        Calendar endCalendar = DateTimeUtil.getCalendarFromDateString(endDateString);

        String depthString = message.substring(HSAConfig.TIME_LOG_LENGTH);

        DepthData depthData = new DepthData();
        depthData.setStartCalendar(startCalendar);
        depthData.setEndCalendar(endCalendar);


        return parse(depthData, depthString);
    }

    public abstract DepthData parse(DepthData depthData, String depthString);
}
