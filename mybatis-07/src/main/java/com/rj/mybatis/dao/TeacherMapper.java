package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
//    通过连接查询
    List<Teacher> getTeacher();
//    通过子查询
    List<Teacher> getTeacher2();
}
