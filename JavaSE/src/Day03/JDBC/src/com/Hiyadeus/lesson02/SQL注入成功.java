package Day03.JDBC.src.com.Hiyadeus.lesson02;

import Day03.JDBC.src.com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL注入成功 {
    public static void main(String[] args) {
        login(" 'or '1=1", " 'or '1=1");
    }

    // 登录业务
    public static void login(String username, String password) {

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            connection = JdbcUtils.getConnection(); // 获取数据库连接
            st = connection.createStatement();
            String sql = "select * from users where `NAME` ='"+username+"' and `password` = '"+password+"'";

            rs = st.executeQuery(sql);
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
