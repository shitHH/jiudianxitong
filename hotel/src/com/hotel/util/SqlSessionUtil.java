package com.hotel.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author  gmx
 * session工具类
 */
public class SqlSessionUtil {
    public static SqlSession getsession(){
        SqlSession session=null;
        try{
            //获取当前的配置文件
            String resources="configuration.xml";
            //创建输入流
            InputStream inputStream= Resources.getResourceAsStream(resources);
            //创建SqlsesionFactory工厂对象
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            //创建session对象
            session= sqlSessionFactory.openSession(true);

        }catch(Exception exception){
            exception.printStackTrace();
        }
        return session;
    }
}
