package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;

import java.util.List;

public class UserDaoTest {
    private Object MybatisUtils;

    @Test
    public void test() {

        // 获取SqlSession对象
        SqlSession sqlSession = utils.MybatisUtils.getSqlSession();
        // Method1:getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        // Method2
        // List<User> userList1 = sqlSession.selectList("dao.UserDao.getUserList");


        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = utils.MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(5);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = utils.MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(new User(5,"MAO","FinChann"));
        if (res > 0) {
            System.out.println("插入成功");
        }

        // 必须要提交事务才能成功！
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = utils.MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(4,"Carson","现在凌晨两点半"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = utils.MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }

}
