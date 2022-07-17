package yang.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestMain
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 17:28
 * @Version v1.0
 **/


public class TestMain2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object hello = context.getBean("hello");
        hello.toString();
        System.out.println("dddddd");
    }
}
