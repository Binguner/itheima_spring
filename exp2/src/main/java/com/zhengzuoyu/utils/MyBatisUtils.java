package com.zhengzuoyu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){
        if (sqlSessionFactory == null) {
            synchronized (MyBatisUtils.class){
                if (sqlSessionFactory == null) {
                    try {
                        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return sqlSessionFactory.openSession();
    }
}
