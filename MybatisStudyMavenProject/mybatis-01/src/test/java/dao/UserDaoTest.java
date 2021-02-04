package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {

        // 获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // Method1:getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        // Method2
        // List<User> userList1 = sqlSession.selectList("dao.UserDao.getUserList");


        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
