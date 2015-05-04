package com.example.liam_pc.coolweather.util;

/**
 * Created by liam-PC on 2015/5/3 0003.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
