package com.rj.mybatis.pojo;

public class Students {
    private int id;
    private String sName;
    private Teacher teacher;
    
    public Students() {
    }
    
    public Students(int id, String sName, Teacher teacher) {
        this.id = id;
        this.sName = sName;
        this.teacher = teacher;
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
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
