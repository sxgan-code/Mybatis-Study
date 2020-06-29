package com.rj.mybatis.pojo;

import java.util.List;

public class Teacher {
    private int id;
    private String tName;
    private List<Students> students;
    
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", tName='" + tName + '\'' +
                ", students=" + students +
                '}';
    }
    
    public Teacher() {
    }
    
    public Teacher(int id, String tName, List<Students> students) {
        this.id = id;
        this.tName = tName;
        this.students = students;
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
    
    public List<Students> getStudents() {
        return students;
    }
    
    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
