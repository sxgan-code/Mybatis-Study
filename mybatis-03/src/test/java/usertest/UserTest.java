package usertest;

import com.rj.mybatis.dao.UserMapper;
import com.rj.mybatis.pojo.User;
import com.rj.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;

public class UserTest {
    private Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void testSelect(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.allUser();
        if (list != null) {
            logger.debug("成功获取到数据");
        }
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
//    增加用户
    @Test
    public void addTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.addUser(new User(6, "赵丽颖", "147258"));
        if (result>0) {
            logger.debug("成功插入"+result+"数据");
        }
        sqlSession.commit();
        sqlSession.close();
    }
//    删除用户
    @Test
    public void deleteTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.deleteUser(5);
        if(result>0){
            logger.debug("成功删除"+result+"个用户");
        }
        sqlSession.commit();
        sqlSession.close();
    }
//    修改用户
    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.updateUser(new User(2, "赵丽颖", "159357"));
        if(result>0){
            logger.debug("成功修改"+result+"一个用户");
        }
        sqlSession.commit();
        sqlSession.close();
    }
//    通过limit分页
    @Test
    public void testLimit(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> list = mapper.limitUser(map);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
//    通过RowBounds
    @Test
    public void limitByRowBounds(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(2, 2);
        List<User> list = sqlSession.selectList("com.rj.mybatis.dao.UserMapper.limitByRowBounds", null, rowBounds);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
