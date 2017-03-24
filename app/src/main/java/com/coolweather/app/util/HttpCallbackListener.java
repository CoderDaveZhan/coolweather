package com.coolweather.app.util;

/**
 * Created by zhanbiqiang on 23/03/2017.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
