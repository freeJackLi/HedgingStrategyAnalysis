package com.freelxl.coin.hsa.spider;

import com.freelxl.coin.hsa.net.CURLUtil;
import com.freelxl.coin.hsa.utils.DateTimeUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lixiuliang on 2017/12/1.
 */
public class HSASpiderRunnable implements Runnable {

    String url;

    File workDir;

    public HSASpiderRunnable(String market, String currencyPair, String url, String workDir) {

        this.url = url;

        this.workDir = new File(workDir + "/" + market + "/" + currencyPair);
        if (!this.workDir.exists()) {
            this.workDir.mkdirs();
        }
    }

    public void run() {

        try {
            String result = CURLUtil.curl(url);
            String dateTime = DateTimeUtil.getCurrentDateTimeString();

            File file = new File(workDir,
                    DateTimeUtil.getCurrentDateString() + "/" + DateTimeUtil.getCurrentHourString());
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

            writer.append(dateTime + result + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
