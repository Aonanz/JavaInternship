package com.Hiyadeus.lesson01;

import java.sql.*;

public class MyFirstJCBCProgramme {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1. 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); // 固定写法
        //2. 连接信息，用户信息和url
        String url = "jdbc:mysql://localhost:3306/jdbcStudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "brainmachine2018";
        //3. 连接成功，返回数据库对象
        Connection connection = DriverManager.getConnection(url,username,password);
        //4. 执行SQL的对象
        Statement statement = connection.createStatement();
        //5. 执行SQL的对象，去执行SQL
        String sql = "SELECT * FROM users";
        ResultSet resultSet = statement.executeQuery(sql);  // 返回的结果集
        while(resultSet.next()){
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("name=" + resultSet.getObject("NAME"));
            System.out.println("pwd=" + resultSet.getObject("PASSWORD"));
            System.out.println("email=" + resultSet.getObject("email"));
            System.out.println("birth=" + resultSet.getObject("birthday"));
            System.out.println("===========================================");

        }
        //6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
