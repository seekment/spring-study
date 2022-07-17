import com.yang.pojo.User;
import com.yang.pojo.YangConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 23:45
 * @Version v1.0
 **/


public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(YangConfig.class);
        User getUser = (User) applicationContext.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
