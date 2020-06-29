package com.rj.mybatis.pojo;

public class Students {
    private int id;
    private String sName;
    private int tid;
    
    public Students() {
    }
    
    public Students(int id, String sName, int tid) {
        this.id = id;
        this.sName = sName;
        this.tid = tid;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getsName() {
        return sName;
    }
    
    public void setsName(String sName) {
        this.sName = sName;
    }
    
    public int getTid() {
        return tid;
    }
    
    public void setTid(int tid) {
        this.tid = tid;
    }
    
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", tid=" + tid +
                '}';
    }
}
