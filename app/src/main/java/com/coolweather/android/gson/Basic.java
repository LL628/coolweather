package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public String update;

    public class Update{
        @SerializedName("update")
        public String updateTime;
    }
}
