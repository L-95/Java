import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        do {
            System.out.print("输入月份查询季节——");
            Scanner enter=new Scanner(System.in);
            int num=enter.nextInt();
            switch (num) {
                case 1:
                case 2:
                case 3:
                    System.out.println("春季");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("夏季");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("秋季");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("冬季");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }while (true);
    }
}
