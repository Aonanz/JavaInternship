package com.Hiyadeus.lesson03;

import com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.*;

public class SQL注入 {
    public static void main(String[] args) {
        // login(" 'or '1=1", " 'or '1=1");
        login("Hiyadeus", "123456");
    }

    // 登录业务
    public static void login(String username, String password) {

        Connection connection = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            connection = JdbcUtils.getConnection(); // 获取数据库连接
            String sql = "select * from users where `NAME` =? and `password` = ?";

            st = connection.prepareStatement(sql);
            st.setString(1,username);
            st.setString(2,password);

            rs = st.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("NAME"));
                System.out.println(rs.getString("PASSWORD"));
                System.out.println("===================================");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,st,rs);
        }
    }
}
