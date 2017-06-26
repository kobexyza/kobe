package com.mmall.pojo;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderId;

    private Integer payPlatform;

    private String payNumber;

    private String payStatus;

    private Date creatTime;

    private Date updateTime;

    public PayInfo(Integer id, Integer userId, Long orderId, Integer payPlatform, String payNumber, String payStatus, Date creatTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.payPlatform = payPlatform;
        this.payNumber = payNumber;
        this.payStatus = payStatus;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public PayInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber == null ? null : payNumber.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}