package com.example.model;

import java.sql.Timestamp;

public class adminorder {
    private String orderid;
    private Timestamp costtime;
    private Integer costmoney;
    private Integer allmoney;
    private String comment;
    private String staffid;

    public adminorder(String orderid, Timestamp costtime, Integer costmoney, Integer allmoney, String comment, String staffid) {
        this.orderid = orderid;
        this.costtime = costtime;
        this.costmoney = costmoney;
        this.allmoney = allmoney;
        this.comment = comment;
        this.staffid = staffid;
    }

    public adminorder() {
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Timestamp getCosttime() {
        return costtime;
    }

    public void setCosttime(Timestamp costtime) {
        this.costtime = costtime;
    }

    public Integer getChangemoney() {
        return costmoney;
    }

    public void setChangemoney(Integer changemoney) {
        this.costmoney = costmoney;
    }

    public Integer getLeftmoney() {
        return allmoney;
    }

    public void setLeftmoney(Integer allmoney) {
        this.allmoney = allmoney;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    @Override
    public String toString() {
        return "adminorder{" +
                "orderid='" + orderid + '\'' +
                ", costtime=" + costtime +
                ", changemoney=" + costmoney +
                ", leftmoney=" + allmoney +
                ", comment='" + comment + '\'' +
                ", staffid='" + staffid + '\'' +
                '}';
    }
}
