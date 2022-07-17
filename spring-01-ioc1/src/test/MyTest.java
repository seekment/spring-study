import com.yang.dao.UserDaoImpl;
import com.yang.service.UserServiceImpl;

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 10:02
 * @Version v1.0
 **/


public class MyTest {

    public static void main(String[] args) {

       // UserServiceImpl userService = new UserServiceImpl(new UserDaoMySQLImpl());
        UserServiceImpl userService = new UserServiceImpl(new UserDaoImpl());
        userService.getUser();
    }
}
