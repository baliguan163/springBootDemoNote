package com.ado.demo.domian;

import java.io.Serializable;

//城市实体类
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;//城市编号
    private Long provinceId;//省份编号
    private String cityName;//城市名称

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Long getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }


    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", provinceId=" + provinceId +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
