package dao;

import org.mybatis.spring.SqlSessionTemplate;
import pojo.User;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> getUserLike(String value) {
        return null;
    }

    @Override
    public List<User> selectUser() {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.selectUser();
    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserById2(Map<String, Object> map) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int addUser2(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User login(User user) {
//        System.out.println(-1);
//        User use = new User();
//        user.setName("jack");
//        user.setPwd("123456");
//        return use;
        return null;
    }
}
