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
        int result = mapper.addUser(new User(5, "hello", "125455"));
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
        int result = mapper.updateUser(new User(3, "赵丽颖", "159357"));
        if(result>0){
            logger.debug("成功修改"+result+"一个用户");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
