package com.Hiyadeus.lesson05;

import com.Hiyadeus.lesson02.utils.JdbcUtils;
import com.Hiyadeus.lesson05.utils.JdbcUtils_DBCP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDBCP {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;

        try{
            connection = JdbcUtils_DBCP.getConnection();

            //区别, 使用?占位符代替参数
            String sql = "INSERT INTO users(id,`NAME`,`PASSWORD`,`email`,`birthday`)" +
                    "VALUES(?,?,?,?,?)";
            ps = connection.prepareStatement(sql);  //预编译SQL，先写sql，然后不执行

            // 手动给参数赋值
            ps.setInt(1,4); // id
            ps.setString(2,"Hiya");
            ps.setString(3,"Mystory");
            ps.setString(4,"aonanzhng@gmail.com");
            ps.setDate(5, (new java.sql.Date(System.currentTimeMillis())));

            // 执行
            int i = ps.executeUpdate();
            if(i > 0) {
                System.out.println("插入成功");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection,ps,null);
        }
    }
}
