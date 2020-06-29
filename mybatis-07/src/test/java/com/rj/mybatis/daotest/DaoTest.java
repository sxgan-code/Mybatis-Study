package com.rj.mybatis.daotest;

import com.rj.mybatis.dao.TeacherMapper;
import com.rj.mybatis.pojo.Teacher;
import com.rj.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DaoTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.getTeacher();
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacher2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.getTeacher2();
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    
}
