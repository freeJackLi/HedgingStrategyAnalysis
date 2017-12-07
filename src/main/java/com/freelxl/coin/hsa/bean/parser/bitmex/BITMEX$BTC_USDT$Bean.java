package com.freelxl.coin.hsa.bean.parser.bitmex;

/*
[{"symbol":"XBTUSD","level":0,"bidSize":60078,"bidPrice":14383.5,"askPrice":14384,"askSize":55984,"timestamp":"2017-12-07T05:02:49.117Z"},{"symbol":"XBTUSD","level":1,"bidSize":4000,"bidPrice":14382.5,"askPrice":14384.5,"askSize":3000,"timestamp":"2017-12-07T05:02:49.117Z"},{"symbol":"XBTUSD","level":2,"bidSize":7500,"bidPrice":14382,"askPrice":14387.5,"askSize":449,"timestamp":"2017-12-07T05:02:49.117Z"},{"symbol":"XBTUSD","level":3,"bidSize":25270,"bidPrice":14380,"askPrice":14388,"askSize":28447,"timestamp":"2017-12-07T05:02:49.117Z"},{"symbol":"XBTUSD","level":4,"bidSize":2200,"bidPrice":14379.5,"askPrice":14390,"askSize":131319,"timestamp":"2017-12-07T05:02:49.117Z"}]
*/

public class BITMEX$BTC_USDT$Bean {

    /**
     * symbol : XBTUSD
     * level : 0
     * bidSize : 91567
     * bidPrice : 12585
     * askPrice : 12585.5
     * askSize : 33614
     * timestamp : 2017-12-06T10:01:34.782Z
     */

    private String symbol;
    private int level;
    private double bidSize;
    private double bidPrice;
    private double askPrice;
    private double askSize;
    private String timestamp;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getBidSize() {
        return bidSize;
    }

    public void setBidSize(double bidSize) {
        this.bidSize = bidSize;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public double getAskSize() {
        return askSize;
    }

    public void setAskSize(double askSize) {
        this.askSize = askSize;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
