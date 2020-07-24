package com.example.roomdemo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.os.Parcel;
import android.support.annotation.NonNull;

import java.util.List;

@Entity
public class ShopBean {

    public static final int PREFER_SHOW = 1;

    @PrimaryKey
    public int id;
    public String dealerId;

    public String dealerName;

    public String dealerDesc;

    public String province;
    public String city;
    public String address;

    public int coordType;
    public String direction;
    public String lon;
    public String lat;
    public String jvflag;
    public String tel400;
    public String services;
    public String distance;
    // 单位m
    public int distanceMeter;

    public String modifyTime;

    public int isPrefer;
    @Ignore
    public String dateTime;
    @Ignore
    public String date;
    @Ignore
    public String time;
    @Ignore
    public boolean displayDistance;

    /**
     * 服务类型
     */
    @Ignore
    public String serviceType;

    public int mType = 1;

    public long updateTime;

    @TypeConverters(DateBeanTypeConverter.class)
    public List<DateBean> dateBeanList;

    public List<DateBean> getDateBeanList() {
        return dateBeanList;
    }

    public void setDateBeanList(List<DateBean> dateBeanList) {
        this.dateBeanList = dateBeanList;
    }

    public ShopBean() {
    }

    @Override
    public String toString() {
        return "ShopBean{" +
                "id" + id +
                "dealerId=" + dealerId + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", dealerDesc='" + dealerDesc + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", coordType=" + coordType +
                ", direction='" + direction + '\'' +
                ", lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                ", jvflag='" + jvflag + '\'' +
                ", tel400='" + tel400 + '\'' +
                ", services='" + services + '\'' +
                ", distance='" + distance + '\'' +
                ", distanceMeter=" + distanceMeter +
                ", modifyTime='" + modifyTime + '\'' +
                ", isPrefer=" + isPrefer +
                ", dateTime='" + dateTime + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", displayDistance=" + displayDistance +
                ", serviceType='" + serviceType + '\'' +
                ", mType=" + mType +
                ", updateTime=" + updateTime +
                ", dateBeanList=" + dateBeanList +
                '}';
    }
}
