package com.rj.mybatis.pojo;

import java.util.Date;

public class UserInfo {
    private int id;
    private String uName;
    private int uAge;
    private String time;
    
    public UserInfo() {
    }
    
    public UserInfo(int id, String uName, int uAge, String time) {
        this.id = id;
        this.uName = uName;
        this.uAge = uAge;
        this.time = time;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getuName() {
        return uName;
    }
    
    public void setuName(String uName) {
        this.uName = uName;
    }
    
    public int getuAge() {
        return uAge;
    }
    
    public void setuAge(int uAge) {
        this.uAge = uAge;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", uAge='" + uAge + '\'' +
                ", time=" + time +
                '}';
    }
}
