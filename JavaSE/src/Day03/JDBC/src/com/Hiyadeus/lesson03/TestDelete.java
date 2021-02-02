package com.Hiyadeus.lesson03;

import com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.*;

public class TestDelete {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;

        try{
            connection = JdbcUtils.getConnection();

            //区别, 使用?占位符代替参数
            String sql = "delete from users where id= ?";
            ps = connection.prepareStatement(sql);  //预编译SQL，先写sql，然后不执行
            ps.setInt(1,4);
            int i = ps.executeUpdate();
            if(i > 0) {
                System.out.println("删除成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,ps,null);
        }
    }
}
