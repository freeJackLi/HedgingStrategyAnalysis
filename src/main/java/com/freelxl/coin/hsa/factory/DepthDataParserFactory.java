package com.freelxl.coin.hsa.factory;

import com.freelxl.coin.hsa.parser.DepthDataParser;
import com.freelxl.coin.hsa.parser.impl.bitmex.BITMEX$BTC_USDT$Parser;
import com.freelxl.coin.hsa.parser.impl.okex.OKEX$BTC_USDT_QUARTER$Parser;

public class DepthDataParserFactory {

    public static DepthDataParser getParser(String market, String currencyPair) {

        if (market.equals("okex") && currencyPair.equals("btc_usdt_quarter")) {
            return new OKEX$BTC_USDT_QUARTER$Parser();
        } else if (market.equals("bitmex") && currencyPair.equals("btc_usdt")) {
            return new BITMEX$BTC_USDT$Parser();
        }

        return null;
    }
}
