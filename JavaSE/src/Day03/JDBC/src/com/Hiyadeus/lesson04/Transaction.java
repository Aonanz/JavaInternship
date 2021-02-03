package Day03.JDBC.src.com.Hiyadeus.lesson04;

import Day03.JDBC.src.com.Hiyadeus.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transaction {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            connection = JdbcUtils.getConnection();
            connection.setAutoCommit(false);

            String sql1 = "update account set money = money-100 where name = 'A'";
            st = connection.prepareStatement(sql1);
            st.executeUpdate();

//            int x = 1/0;

            String sql2 = "update account set money = money+100 where name = 'B'";
            st = connection.prepareStatement(sql2);
//            st.executeUpdate();

            int i = st.executeUpdate();
            if(i > 0) {
                System.out.println("转账成功");
            }

            connection.commit();
        } catch (Exception throwables) {
            try {
                System.out.println("转账失败");
                connection.rollback();
            } catch (Exception e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection,st,rs);
        }
    }
}
