import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//编写实体类，编写工具类，编写核心配置文件，编写接口，编写Mapper.xml，测试


public class MyTest {

    @Test
    public void test() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        for(User user : userList) {
            System.out.println(user);
        }
    }



//    @Test
//    public void test() throws IOException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
//        for (User user : userMapper.selectUser()) {
//            System.out.println(user);
//        }
//    }
}
