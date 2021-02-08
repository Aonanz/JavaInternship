package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.io.IOException;
import java.util.List;

public class MyTest {
    @Test
    public void test(){
//        SqlSession sqlSession = utils.MybatisUtils.getSqlSession();
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser();
//
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        sqlSession.close();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

        // 用户名密码正确
//        User theUser1 = new User();
//        theUser1.setName("jack");
//        theUser1.setPwd("123456");

//        // 找不到用户名
//        User theUser1 = new User();
//        theUser1.setName("jac");
//        theUser1.setPwd("123456");
//
//        // 用户名正确密码错误
//        User theUser1 = new User();
//        theUser1.setName("jack");
//        theUser1.setPwd("12345");

//        boolean found1 = false;
//        boolean foundName1 = false;
//
//        for(User user : userMapper.selectUser()) {
//            if (user.getName().equals(theUser1.getName())) {
//                foundName1 = true;
//                if (user.getPwd().equals(theUser1.getPwd())) {
//                    found1 = true;
//                    System.out.println(user);
//                }
//            }
//        }
//
//        if(foundName1 == false) {
//            System.out.println("用户名不存在 ");
//        }else if (foundName1 == true && found1 == false){
//            System.out.println("密码错误");
//        }

//        for (User user : userMapper.selectUser()) {
//            System.out.println(user);
//        }
    }

    @Test
    public void login(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }

}
