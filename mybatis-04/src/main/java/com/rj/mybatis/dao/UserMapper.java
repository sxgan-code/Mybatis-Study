package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
//    查询所有人
    @Select("select * from tb_user")
    List<User> allUser();
//    增加
    @Insert("insert into tb_user values(#{id},#{userName},#{userPass})")
    int addUser(User user);
//    删除
    @Delete("delete from tb_user where id=#{id}")
    int deleteUser(@Param("id") int id);
//    修改
    @Update("update tb_user set uname=#{userName},upass=#{userPass} where id=#{id}")
    int updateUser(User user);
    
}
