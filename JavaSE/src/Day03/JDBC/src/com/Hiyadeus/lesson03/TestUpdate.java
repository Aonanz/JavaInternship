package Day03.JDBC.src.com.Hiyadeus.lesson03;

import Day03.JDBC.src.com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.*;

public class TestUpdate {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement ps = null;

        try{
            connection = JdbcUtils.getConnection(); // 获取数据库连接
            String sql = "UPDATE users SET `NAME` = ?, `email`=? WHERE id=?";
            ps=connection.prepareStatement(sql);

            ps.setString(1,"JackIsGone");
            ps.setString(2,"aonan990616@qq.com");
            ps.setInt(3,3);


            int i = ps.executeUpdate();
            if(i > 0) {
                System.out.println("更新成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,ps,null);
        }
    }
}
