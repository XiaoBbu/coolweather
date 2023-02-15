package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 *
 * 利用 okHttp 从服务端获取全国省市县的数据
 */
public class HttpUtil {

    // okhttp3类中自带的回调接口Callback
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);// enqueue()方法封装了开启一条子线程执行HTTP请求，并通过Callback接口进行回调
    }
}
