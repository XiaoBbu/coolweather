package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;

    private String countyName;// 县的名字

    private String weatherId;// 该县对应天气的id

    private int cityId;// 县所属市的id

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }
}
