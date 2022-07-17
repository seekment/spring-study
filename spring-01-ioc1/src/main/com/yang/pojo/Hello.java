package yang.pojo;

/**
 * @ClassName Hello
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 16:33
 * @Version v1.0
 **/


public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
