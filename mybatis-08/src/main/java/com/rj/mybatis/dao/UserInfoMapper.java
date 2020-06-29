package com.rj.mybatis.dao;

import com.rj.mybatis.pojo.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper {
//    添加数据
    int insertUser(Map<String,Object> map);
    //    查询所有用户
    UserInfo getQueryAllUser(int id);
//    通过if来查询
    List<UserInfo> queryUserByIf(Map<String,Object> map);
//    通过choose来查询
    List<UserInfo> queryUserByChoose(Map<String,Object> map);
//    更新语句
    int updateUser(Map<String,Object> map);
//    遍历查询数据
    List<UserInfo> foreachUser(List list);
}
