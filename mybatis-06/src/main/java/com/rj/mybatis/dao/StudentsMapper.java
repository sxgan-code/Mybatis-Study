package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.Students;

import java.util.List;

public interface StudentsMapper {
//    通过子查询来查出学生及老师
    List<Students> getStudents();
//    通过链表查询
    List<Students> getStudents2();
}

