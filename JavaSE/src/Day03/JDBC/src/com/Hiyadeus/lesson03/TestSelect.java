package Day03.JDBC.src.com.Hiyadeus.lesson03;

import Day03.JDBC.src.com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.*;

public class TestSelect {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            connection = JdbcUtils.getConnection();
            String sql = "select * from users where id = ?";
            st = connection.prepareStatement(sql);
            st.setInt(1,2);

            rs = st.executeQuery();
            if(rs.next()) {
                System.out.println(rs.getString("NAME"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,st,rs);
        }
    }
}
