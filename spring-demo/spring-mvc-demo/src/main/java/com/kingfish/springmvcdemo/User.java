package com.kingfish.springmvcdemo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private  static  final long serialVersionUID = 1L;
    private String account;
    private String username;
    private String password;
    private Date date;

    public User(String account, String username, String password, Date date) {
        this.account = account;
        this.username = username;
        this.password = password;
        this.date = date;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", date=" + date +
                '}';
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}