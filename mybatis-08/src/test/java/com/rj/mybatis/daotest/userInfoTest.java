package com.rj.mybatis.daotest;

import com.rj.mybatis.dao.UserInfoMapper;
import com.rj.mybatis.pojo.UserInfo;
import com.rj.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.*;

public class userInfoTest {
    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id",7);
        map.put("uName","袁冰妍");
        map.put("uAge",29);
        map.put("time","2011-06-28");
        int i = mapper.insertUser(map);
        System.out.println(i);
        sqlSession.close();
    }
    @Test
    public void userInfoQuery() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        UserInfo userInfo1 = mapper.getQueryAllUser(6);
        System.out.println(userInfo1);
        System.out.println("====================================");
        UserInfo userInfo2 = mapper.getQueryAllUser(6);
        System.out.println(userInfo2);
        sqlSession.close();
    }
    @Test
    public void queryUserByIf() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id",6);
        System.out.println("第一次执行");
        UserInfo user = mapper.getQueryAllUser(6);
        System.out.println(user);
        System.out.println("第二次执行");
        UserInfo user2 = mapper.getQueryAllUser(6);
        System.out.println(user2);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("二级缓存观测点");
        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper2 = sqlSession2.getMapper(UserInfoMapper.class);
        UserInfo user3 = mapper2.getQueryAllUser(6);
        System.out.println(user3);
        System.out.println("第二次执行");
        UserInfo user4 = mapper2.getQueryAllUser(6);
        System.out.println(user4);
        sqlSession2.close();
    }
    @Test
    public void queryUserByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("column","uAge");
        List<UserInfo> list = mapper.queryUserByChoose(map);
        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
        sqlSession.close();
    }
    @Test
    public void foreachUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        List<Integer> list = new ArrayList<Integer>();
        for( int i = 1 ;i <5 ; i++ ){
            list.add(i);
        }
        List<UserInfo> list1 = mapper.foreachUser(list);
        for (UserInfo userInfo : list1) {
            System.out.println(userInfo);
        }
        sqlSession.close();
    }
    @Test
    public void updateUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id",2);
        map.put("uAge",14);
        int i = mapper.updateUser(map);
        System.out.println(i);
        sqlSession.close();
    }


    @Test
    public void getRandomId(){
        
        UUID uuid =UUID.randomUUID();
        System.out.println(uuid);
//        将随机的UUID转换为一串32位的字符
        String s = uuid.toString().replaceAll("-", "");
        System.out.println("32位:"+s);
//        将随机的UUID转换为一串指定位数(8位)的字符串
        String s1 = uuid.toString().replaceAll("-", "").substring(0,8);
        System.out.println("8位:"+s1);
//        将所有字母转换为大小写
        String s2 = uuid.toString().replaceAll("-", "").toUpperCase();
        System.out.println("大写"+s2);
        System.out.println("小写"+s2.toLowerCase());
        
    }
    
}
