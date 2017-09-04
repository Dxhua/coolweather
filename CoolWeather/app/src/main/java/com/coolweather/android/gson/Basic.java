package com.coolweather.android.gson;

import android.text.style.UpdateLayout;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/5 0005.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
