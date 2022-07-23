import com.yang.mapper.UserMapper;
import com.yang.pojo.User;
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

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/23 18:13
 * @Version v1.0
 **/


public class MyTest {
    public static void main(String[] args) {

    }
    // 整合前，老方式使用mybatis
 @Test
 public void test() throws IOException {
String resource = "mybatis-config.xml";
     InputStream resourceAsStream = Resources.getResourceAsStream(resource);
     SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
     SqlSession sqlSession = build.openSession(true);

     UserMapper mapper = sqlSession.getMapper(UserMapper.class);
     List<User> users = mapper.selectUser();
     for (int i = 0; i < users.size(); i++) {
         System.out.println(users.get(i));
     }

 }


// 整合后
    @Test
    public void test2() throws IOException {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = classPathXmlApplicationContext.getBean("UserMapper", UserMapper.class);

        List<User> users = userMapper.selectUser();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

    }
}