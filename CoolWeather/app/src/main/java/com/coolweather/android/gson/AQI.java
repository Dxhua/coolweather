package com.coolweather.android.gson;

/**
 * Created by Administrator on 2017/8/5 0005.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
