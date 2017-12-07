package com.freelxl.coin.hsa.bean.parser;

import java.util.List;

public class OKEX$BTC_USDT_QUARTER$Bean {
    private List<List<Double>> asks;
    private List<List<Double>> bids;

    public List<List<Double>> getAsks() {
        return asks;
    }

    public void setAsks(List<List<Double>> asks) {
        this.asks = asks;
    }

    public List<List<Double>> getBids() {
        return bids;
    }

    public void setBids(List<List<Double>> bids) {
        this.bids = bids;
    }
}
