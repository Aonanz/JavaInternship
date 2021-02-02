package com.Hiyadeus.lesson02;

import com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            connection = JdbcUtils.getConnection(); // 获取数据库连接
            st = connection.createStatement();
            String sql = "UPDATE users SET `NAME` = 'Hiyadeus', `email`='947743475@qq.com' WHERE id=1";
            int i = st.executeUpdate(sql);
            if(i > 0) {
                System.out.println("更新成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,st,rs);
        }
    }
}
