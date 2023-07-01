package com.cookandroid.capstone;

public class WorkData {
    private String Pay;
    private String RestTime;
    private String date;
    private String endTime;
    private String money;
    private String startTime;

    public WorkData() {
        // Default constructor required for calls to DataSnapshot.getValue(WorkData.class)
    }

    public WorkData(String Pay, String RestTime, String date, String endTime, String money, String startTime) {
        this.Pay = Pay;
        this.RestTime = RestTime;
        this.date = date;
        this.endTime = endTime;
        this.money = money;
        this.startTime = startTime;
    }

    public String getPay() {
        return Pay;
    }

    public void setPay(String Pay) {
        this.Pay = Pay;
    }

    public String getRestTime() {
        return RestTime;
    }

    public void setRestTime(String RestTime) {
        this.RestTime = RestTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}