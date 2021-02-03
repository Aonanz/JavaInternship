package Day03.JDBC.src.com.Hiyadeus.lesson05.utils;

import Day03.JDBC.src.com.Hiyadeus.lesson02.utils.JdbcUtils;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils_DBCP {

    private static DataSource dataSource = null;

    static {
        try{
            InputStream in = JdbcUtils_DBCP.class.getClassLoader().getResourceAsStream("Day03/JDBC/src/dbcpconfig.properties");
            Properties properties = new Properties();
            properties.load(in);

            // 创建数据源
            dataSource = BasicDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void release(Connection conn, Statement st, ResultSet rs){
        JdbcUtils.close(conn, st, rs);
    }
}
