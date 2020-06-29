package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
//    查询所有人
    List<User> allUser();
//    增加
    int addUser(User user);
//    删除
    int deleteUser(int id);
//    修改
    int updateUser(User user);
    
}
