package com.freelxl.coin.hsa.spider;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiuliang on 2017/12/1.
 */
public class HSASpiderControl {


    public static void main(String[] args) throws IOException {


        Properties properties = new Properties();
        properties.load(HSASpiderControl.class.getClassLoader().getResourceAsStream("hsa.properties"));

        String markets = properties.getProperty("markets");
        String workDir = properties.getProperty("workDir");
        long spiderPeriod = Long.parseLong(properties.getProperty("spiderPeriod"));


        String[] marketsArr = markets.split(",");

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(100);

        for (String market : marketsArr) {


            String currencyPairs = properties.getProperty("market.currencyPairs." + market);
            String[] currencyPairsArr = currencyPairs.split(",");

            for (String currencyPair : currencyPairsArr) {

                String url = properties.getProperty("market.depthURL." + market + "." + currencyPair);

                System.out.println("Star Spider: market=" + market + " currencyPair=" + currencyPair + " url=" + url);
                HSASpiderRunnable hsaSpiderThread = new HSASpiderRunnable(market, currencyPair, url, workDir);

                executorService.scheduleAtFixedRate(hsaSpiderThread, 1000, spiderPeriod, TimeUnit.MILLISECONDS);
            }
        }
    }

}
