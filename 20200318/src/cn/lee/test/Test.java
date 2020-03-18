package cn.lee.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        User user = new User(123456,666666,0);
        longIn(user);
        operating(user);
    }

    public static void operating(User user) {
        do {
            menu();
            switch(user.scanner()) {
                case 1:
                    System.out.println("请输入您要存的金额");
                    user.setMoney(user.scanner());
                    break;
                case 2:
                    System.out.println("您的余额为："+user.getMoney());
                    break;
                case 3:
                    System.out.println("请输入您要取的金额");
                    user.drawMoney(user.scanner());
                    break;
                case 4:
                    user.transfer();
                    break;
                case 5:
                    System.out.println("请拿走您的卡片");
                    return;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }while(true);
    }

    public static void menu() {
        System.out.println("1：存钱        2：查询");
        System.out.println("3：取钱        4：转账");
        System.out.println("               5：退卡");
    }

    public static void longIn(User user) {
        System.out.println("欢迎登录本系统");
        int count = 3;
        while(count !=0) {
            count--;
            System.out.println("请输入账号：");
            if (user.id == user.scanner()) {
                System.out.println("请输入密码：");
                if (user.password == user.scanner()) {
                    System.out.println("登陆成功");
                    return;
                }
            }else {
                System.out.println("账号或密码错误，请重新输入");
            }
        }
    }

    static class User {
        int id;
        int password;
        int money;

        public User(int id,int password,int money) {
            this.id = id;
            this.password = password;
            this.money = money;
        }

        public void transfer() {
            System.out.println("该功能暂不支持");
        }

        public void drawMoney(int money) {
            if (this.money >= money) {
                this.money -= money;
            }else {
                System.out.println("余额不足");
            }

        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money += money;
        }
        public int scanner() {
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }

    }
}
