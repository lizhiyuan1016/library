package com.sanqing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
    protected static String dbClassName= "com. microsoftsqlserver Jdbc. SQLServer Driver";//数据库连接驱动类
    protected static String dbUrl="jdbc:sqlserver: //localhost: 1433;" +"DatabaseName=db_library;";//数据库连接urL
    protected static String dbUser="sa";//数据库用户名
    protected static String dbPwd="123456";//数据库密码
    private static Connection conn =null;//数据库连接对象

    private Dao(){ // 默认构造函数
        try{
         if(conn==null){//如果连接对象为空
             Class.forName(dbClassName);//加载驱动类
             conn=DriverManager.getConnection(dbUrl,dbUser,dbPwd);//获得连接对象
             }
        }catch (Exception ee){
            ee.printStackTrace();
        }
    }
    private static ResultSet executeQuery(String sql){  //查询方法
        try {
            if (conn == null) new Dao();//连接对象为空,重新调用构造方法
            return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery(sql);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private static int executeUpdata(String sql){//更新方法
        try {
            if (conn == null) new Dao();//连接对象为空,重新调用构造方法
            return conn.createStatement().executeUpdate(sql);//执行更新
        }catch (SQLException e){
            e.printStackTrace();
            return -1;
        }
    }
    public static void close(){ //关闭方法
        try {
            conn.close();//关闭连接对象
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            conn=null;//设置连接对象为null值
        }
    }
}