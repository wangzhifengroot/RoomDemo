package com.example.roomdemo;

public class DateBean {

    private String date;
    private int mType = 1;

    public DateBean() {
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getType() {
        return mType;
    }

    public void setType(int mType) {
        this.mType = mType;
    }

    @Override
    public String toString() {
        return "DateBean{" +
                "date='" + date + '\'' +
                ", mType=" + mType +
                '}';
    }
}
