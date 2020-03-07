package cn.lee.Test;
import java.util.Scanner;

/**
 * 模拟银行界面
 * 0.登录账号密码
 * 1.存入
 * 2.取出
 * 3.查询
 * 4.转账
 * 5.取卡
 */

public class Test {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        System.out.println("欢迎使用本程序");
        System.out.println("请输入账户名：");
        Scanner n = new Scanner(System.in);
        int name = n.nextInt();
        System.out.println("请输入密码：");
        Scanner p = new Scanner(System.in);
        int pass = p.nextInt();
        int ret = mySql(name,pass);
        int count = 0;
        while(count < 3) {
            if (ret == 1) {
                System.out.println("登录成功！");
                function();
                count=4;
            }else {
                count++;
                System.out.println("账号或密码错误，请重新输入");
            }
        }
        if (count==3) {
            System.out.println("连续三次账户或密码错误，退出程序");
        }
    }

    private static int mySql(int name,int  pass) {
        //账户密码数据库
        int name0 = 123456;
        int  pass0 = 666666;
        if (name0 == name && pass0 == pass) {
            return 1;
        }else {
            return 0;
        }
    }

    private static int mySql(int money) {
        //余额数据库
        int money0=0;  // 需要服务器保存数据
        if ((money0+= money)>=0) {
            return money0;
        }
        return 0;
    }

    private static void drawMoney() {
        //取钱
        System.out.println("请输入您要取出的金额");
        Scanner m = new Scanner(System.in);
        int money = m.nextInt();
        int ret = mySql(-money);
        if (ret != 0) {
            System.out.println("操作成功");
        }else {
            System.out.println("余额不足");
        }
    }

    private static void saveMoeny() {
        //存钱
        System.out.println("请输入您要存入的金额");
        Scanner m =new Scanner(System.in);
        int money = m.nextInt();
        int ret = mySql(money);
        if (ret >= 0) {
            System.out.println("操作成功");
        }else {
            System.out.println("操作失败");
        }
    }

    private static void inQuire() {
        int ret = mySql(0);
        System.out.println(ret);
    }

    private static void function() {
        do {
            menu();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    saveMoeny();
                    break;
                case 2:
                    drawMoney();
                    break;
                case 3:
                    inQuire();
                    break;
                case 4:
                    System.out.println("该功能暂未开放");
                    break;
                case 5:
                    System.out.println("程序退出，请收好您的卡片");
                    return;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }while (true);
    }

    private static void menu() {
        //菜单
        System.out.println("1，存钱");
        System.out.println("2，取钱");
        System.out.println("3，查询");
        System.out.println("4，转账");
        System.out.println("5，取卡");
    }
}





