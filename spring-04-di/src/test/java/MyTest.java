import com.yang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 21:36
 * @Version v1.0
 **/

// 扩展方式注入
public class MyTest {
    public static void main(String[] args) {
        System.out.println("注入开始");
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)ApplicationContext.getBean("student");

        System.out.println(student.getName());
        System.out.println(student.getAddresss());
        System.out.println(student.getBooks());
        System.out.println(student.getCard());
        System.out.println(student.getGames());
        System.out.println("注入结束");
    }
}
