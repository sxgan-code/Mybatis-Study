package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
//    查询所有人
    List<User> allUser();
//    分页查询
    List<User> limitUser(HashMap<String,Object> map);
//    通过RowBounds实现分页
    List<User> limitByRowBounds();
//    增加
    int addUser(User user);
//    删除
    int deleteUser(int id);
//    修改
    int updateUser(User user);
    
}
