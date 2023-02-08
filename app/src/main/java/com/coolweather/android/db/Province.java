package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    public int id;

    public String provinceName;// 省的名字

    public int provinceCode;// 省的代码

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
