package com.rj.mybatis.daoTest;

import com.rj.mybatis.dao.StudentsMapper;
import com.rj.mybatis.dao.TeacherMapper;
import com.rj.mybatis.pojo.Students;
import com.rj.mybatis.pojo.Teacher;
import com.rj.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.getAllTeacher();
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void getStudents(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        List<Students> list = mapper.getStudents();
        for (Students students : list) {
            System.out.println(students);
        }
        sqlSession.close();
    }
    @Test
    public void getStudents2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        List<Students> list = mapper.getStudents2();
        for (Students students : list) {
            System.out.println(students);
        }
        sqlSession.close();
    }
}
