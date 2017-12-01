package com.freelxl.coin.hsa.net;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by lixiuliang on 2017/12/1.
 */
public class CURLUtil {


    public static String curl(String url) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            String result = response.body().string();
            return result;
        } else {
            throw new RuntimeException("reponse is not successful.");
        }
    }

}
