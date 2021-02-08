package service;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.UserMapper;
import pojo.User;

import javax.annotation.Resource;

@Service
public class ServiceImpl extends SqlSessionDaoSupport implements UserService{

    @Resource
    private UserMapper userMapper;
//    final UserMapper userMapper;
//
//    @Autowired
    public ServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

//    private UserMapper userMapper;
//
//    @Autowired
//    public void setUserDao (UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Override
    public User login() {
        return null;
    }

    @Override
    public User login(User user) {

        boolean matched = false;
        boolean nameMatched = false;

        // System.out.println(userMapper.selectUser());
        for (User eachUser: userMapper.selectUser()) {
            if (user.getName().equals(eachUser.getName())) {
                nameMatched = true;
                if(user.getPwd().equals(eachUser.getPwd())) {
                    System.out.println("登入成功");
                    return user;
                }
            }
        }
        if(nameMatched == false) {
            System.out.println("您输入的用户名不存在");
            return null;
        } else if (nameMatched == true && matched == false) {
            System.out.println("密码错误");
            return null;
        }
        return null;
    }
}

