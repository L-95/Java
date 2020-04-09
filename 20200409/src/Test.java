import java.util.Scanner;

public class Test {
    private static String name = "lee";
    private static String password = "123456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        String name = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        try {
            user(name, password);
        } catch (UserException  userException) {
            userException.printStackTrace();
        } catch (PasswordException passwordException) {
            passwordException.printStackTrace();
        }
    }
    private static void user(String name,String password) throws UserException,PasswordException {
        if (!Test.name.equals(name)) {
            throw new UserException("用户名错误！");
        }
        if (!Test.password.equals(password)) {
            throw new PasswordException("密码错误！");
        }
        System.out.println("登陆成功");
    }

}
class UserException extends Exception {
    public UserException(String s) {
        super(s);
    }
}
class PasswordException extends Exception {
    public PasswordException(String s) {
        super(s);
    }
}
