import com.yang.mapper.UserMapper;
import com.yang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

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
}
