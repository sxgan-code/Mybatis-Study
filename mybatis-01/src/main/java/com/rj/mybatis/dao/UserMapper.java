package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.User;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
//    定义查询所有的用户
    List<User> getUserList();
//    定义根据id查询用户
    User getUserById(int id);
//    定义insert一个User
    int addUser(User user);
//    删除用户
    int deleteUser(int id);
//    修改用户
    int updateUser(User user);
//    创建模糊查询
    List<User> likeUser(String value);
//    通过map来查询
    List<User> mapUserSelect(HashMap<String,Object> map);
    
}
