package service;

import dao.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class ServiceLoginTest {

    @Autowired
    private ServiceImpl svi;
    public ServiceLoginTest(){
        //导入配置
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        svi = context.getBean("serviceImpl", ServiceImpl.class);
    }

    @Test
    public void login(){
        User user = new User();
        user.setId(1);
        user.setName("jack");
        user.setPwd("12346");
        User u = svi.login(user);
        System.out.println(u);
    }

}
