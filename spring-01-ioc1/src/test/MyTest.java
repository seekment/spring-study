

/**
 * @ClassName MyTest
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 10:02
 * @Version v1.0
 **/


public class MyTest {

    public static void main(String[] args) {
        System.out.println("dd");

        com.yang.service.UserServiceImpl userService = new com.yang.service.UserServiceImpl((com.yang.dao.UserDao) new com.yang.dao.UserDaoMySQLImpl());
      //  com.yang.service.UserServiceImpl userService = new com.yang.service.UserServiceImpl(new com.yang.dao.UserDaoImpl());
        userService.getUser();
    }
}
