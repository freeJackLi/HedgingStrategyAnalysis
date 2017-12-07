package com.freelxl.coin.hsa.parser.impl.bitmex;

import com.freelxl.coin.hsa.bean.DepthData;
import com.freelxl.coin.hsa.bean.parser.bitmex.BITMEX$BTC_USDT$Bean;
import com.freelxl.coin.hsa.parser.DepthDataParserAdapter;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class BITMEX$BTC_USDT$Parser extends DepthDataParserAdapter {

    public DepthData parse(DepthData depthData, String depthString) {

        Gson gson = new Gson();

        BITMEX$BTC_USDT$Bean[] bitmex$BTC_usdt$Beans = gson.fromJson(depthString, BITMEX$BTC_USDT$Bean[].class);
        List<BITMEX$BTC_USDT$Bean> jsonBeanList = Arrays.asList(bitmex$BTC_usdt$Beans);

        depthData.setAsk1Price(jsonBeanList.get(0).getAskPrice());
        depthData.setAsk1Size(jsonBeanList.get(0).getAskSize());
        depthData.setAsk2Price(jsonBeanList.get(1).getAskPrice());
        depthData.setAsk2Size(jsonBeanList.get(1).getAskSize());
        depthData.setAsk3Price(jsonBeanList.get(2).getAskPrice());
        depthData.setAsk3Size(jsonBeanList.get(2).getAskSize());
        depthData.setAsk4Price(jsonBeanList.get(3).getAskPrice());
        depthData.setAsk4Size(jsonBeanList.get(3).getAskSize());
        depthData.setAsk5Price(jsonBeanList.get(4).getAskPrice());
        depthData.setAsk5Size(jsonBeanList.get(4).getAskSize());

        depthData.setBid1Price(jsonBeanList.get(0).getBidPrice());
        depthData.setBid1Size(jsonBeanList.get(0).getBidSize());
        depthData.setBid2Price(jsonBeanList.get(1).getBidPrice());
        depthData.setBid2Size(jsonBeanList.get(1).getBidSize());
        depthData.setBid3Price(jsonBeanList.get(2).getBidPrice());
        depthData.setBid3Size(jsonBeanList.get(2).getBidSize());
        depthData.setBid4Price(jsonBeanList.get(3).getBidPrice());
        depthData.setBid4Size(jsonBeanList.get(3).getBidSize());
        depthData.setBid5Price(jsonBeanList.get(4).getBidPrice());
        depthData.setBid5Size(jsonBeanList.get(4).getBidSize());

        return depthData;
    }
}
