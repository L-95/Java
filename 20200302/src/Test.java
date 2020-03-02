import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        do {
            System.out.println("请输入数字判断奇偶性");
            Scanner num = new Scanner(System.in);
            int num1 = num.nextInt();
            if ((num1 & 1) == 0) {
                System.out.println("偶数");
            }
            if ((num1 & 1) == 1) {
                System.out.println("奇数");
            }
        }while(true);
    }
    public static void main1(String[] args) {
        //不创建临时变量交换两个变量的值
        int a = 1;
        int b = 2;
        System.out.println("交换前：a=" + a + "," + "b=" + b);
        a = a ^ b;  //0001^0010=0011;   a=0011=3
        b = a ^ b;  //0011^0010=0001;   b=0001=1
        a = a ^ b;  //0011^0001=0010;   a=0010=2
        System.out.println("交换后：a=" + a + "," + "b=" + b);
    }
}
