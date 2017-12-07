package com.freelxl.coin.hsa.conf;

public interface HSAConfig {


    int TIME_STRING_LENGTH = "2017-12-06 18:01:37.937".length();
    String START_END_DATE_DIVIDER = " | ";
    int TIME_LOG_LENGTH = HSAConfig.TIME_STRING_LENGTH + HSAConfig.START_END_DATE_DIVIDER.length() + HSAConfig.TIME_STRING_LENGTH;
}
