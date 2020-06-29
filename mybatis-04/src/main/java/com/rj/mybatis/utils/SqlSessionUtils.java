package com.rj.mybatis.utils;

import com.sun.deploy.model.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.xml.bind.PrintConversionEvent;
import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {
    private static SqlSessionFactory build;
    static {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            build = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return build.openSession();
        
    }
}
