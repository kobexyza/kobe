package com.mmall.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String passw0rd;

    private String email;

    private String phone;

    private String question;

    private Integer role;

    private Date creatTime;

    private Date updateTime;

    public User(Integer id, String username, String passw0rd, String email, String phone, String question, Integer role, Date creatTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.passw0rd = passw0rd;
        this.email = email;
        this.phone = phone;
        this.question = question;
        this.role = role;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassw0rd() {
        return passw0rd;
    }

    public void setPassw0rd(String passw0rd) {
        this.passw0rd = passw0rd == null ? null : passw0rd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
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