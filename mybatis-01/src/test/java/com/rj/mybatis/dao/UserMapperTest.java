package com.rj.mybatis.dao;


import com.rj.mybatis.pojo.User;
import com.rj.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserMapperTest {
    Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void select(){
        
    
        //        第一步获得sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        方式一：getMapper执行Sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

//        方式二：
//        List<User> userList = sqlSession.selectList("com.rj.mybatis.dao.UserMapper.getUserList");
        
        
        for (User user : userList) {
            System.out.println(user.getId()+" "+user.getUname()+" "+user.getUpass());
        }
        System.out.println("------------------------------");
//    通过id获取用户
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        User userById = mapper1.getUserById(2);
        System.out.println(userById.getId()+" "+userById.getUname()+" "+userById.getUpass());

    }
    @Test
    public void mapUserSelect(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userId",3);
        map.put("userPass","999999");
        List<User> list = mapper.mapUserSelect(map);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
//    模糊查询
    @Test
    public void likeUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.likeUser("a");
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void addTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //    插入数据
        UserMapper mapper2 = sqlSession.getMapper(UserMapper.class);
        int result = mapper2.addUser(new User(6, "李四", "666666"));
        System.out.println(result);
//        在插入数据后一定要提交事务，否则无法插入数据
        sqlSession.commit();
//        关闭sqlSession
        sqlSession.close();
    }
//    删除用户
    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(6);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
//    更新用户
    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.updateUser(new User(5, "王五", "999999"));
        logger.debug("更新了一条数据");
        System.out.println(result);
        sqlSession.commit();
    }
}
