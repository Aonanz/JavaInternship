package com.Hiyadeus.lesson02;

import com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            connection = JdbcUtils.getConnection(); // 获取数据库连接
            st = connection.createStatement();
            String sql = "INSERT INTO users(id,`NAME`,`PASSWORD`,`email`,`birthday`)" +
                    "VALUES(4,'Hiyadeus','brainmachine2018','947@q.c','2021-01-20')";
            int i = st.executeUpdate(sql);
            if(i > 0) {
                System.out.println("插入成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,st,rs);
        }
    }
}
