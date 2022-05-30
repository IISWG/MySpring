package test.bean;

/**
 * @ClassName : UserService
 * @author : muxin
 * @date : 2022/5/30-9:52
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class UserService {

    private String name;

    public UserService() {
    }
    
    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
