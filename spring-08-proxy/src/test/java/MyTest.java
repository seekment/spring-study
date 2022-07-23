import com.yang.demo02_static_proxy.UserService;
import com.yang.demo02_static_proxy.UserServiceImpl;
import com.yang.demo02_static_proxy.UserServiceProxy;

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/18 9:41
 * @Version v1.0
 **/

// 业务上的静态代理实例
public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserService UserService = new UserServiceProxy(userService);
        UserService.add();
    }


}
