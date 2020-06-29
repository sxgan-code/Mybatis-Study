package com.rj.mybatis.pojo;

public class Teacher {
    private int id;
    private String tName;
    
    public Teacher() {
    }
    
    public Teacher(int id, String tName) {
        this.id = id;
        this.tName = tName;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String gettName() {
        return tName;
    }
    
    public void settName(String tName) {
        this.tName = tName;
    }
    
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", tName='" + tName + '\'' +
                '}';
    }
}
