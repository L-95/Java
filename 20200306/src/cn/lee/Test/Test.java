package cn.lee.Test;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //计数器
        int count = 0;
        //当n等于0时，二进制数已不存在1，停止循环
        while (n != 0) {
            //每当n&1不等0时，二进制数的最低位为1，计数器+1
            if ((n&1) != 0) {
                count++;
            }
            /*右移一位，去除最低位，将倒数
            第二位置为最低位，继续判断是否为1。
            无符号右移（>>>）可以判断当十进制数字
            为负数时，二进制数有多少位为1*/
            n >>>= 1;
        }
    System.out.println(count);
    }
    public static void main9(String[] args) {
        do {
            System.out.println("请输入第一个正整数");
            Scanner sc0 = new Scanner(System.in);
            int num0 = sc0.nextInt();
            System.out.println("请输入第二个正整数");
            Scanner sc1 = new Scanner(System.in);
            int num1 = sc1.nextInt();
            if (num0>0&&num1>0) {
                while (true) {
                    int tmp = num0 % num1;
                    if (tmp == 0) {
                        System.out.println("最大公约数为" + num1);
                        break;
                    } else {
                        num0 = num1;
                        num1 = tmp;
                    }
                }
            }else {
                System.out.println("你的输入有误，请重新输入");
            }
        }while (true);
    }
    public static void main8(String[] args) {
        double  sum=0;
        for (int i=1;i<=100;i++) {
            double num=1.0/i;
            int    tmp=-1;
            sum+=(-tmp*num);
        }
        System.out.println(sum);
    }
    public static void main7(String[] args) {
        for (int i=0;i<=9999;i++) {
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            if (a*a*a+b*b*b+c*c*c==i) {
                System.out.println(i);
            }
        }
    }

    public static void main6(String[] args) {
        int random = (int) (Math.random() * 100 + 1); //生成随机数（1-100）
        System.out.println("1，开始游戏");
        System.out.println("2，结束游戏"); //Menu
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        if (pick == 1) {  //游戏体
            do {
                //先执行一次让用户输入答案，再进行判断，循环
                System.out.println("请输入你要猜的数字");
                Scanner sc2 = new Scanner(System.in);
                int num = sc2.nextInt();
                if (num == random) { //获胜判断
                    System.out.println("游戏获胜");
                } else if (num > random) { //大小判断
                    System.out.println("数字过大");
                } else {
                    System.out.println("数字过小");
                }
            } while (true);
        }
    }

    public static void main5(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age > 0 && age <= 256) {
                if (age <= 18) {
                    System.out.println("当前年龄的人是少年");
                } else if (age <= 28) {
                    System.out.println("当前年龄的人是青年");
                } else if (age <= 55) {
                    System.out.println("当前年龄的人是中年");
                } else if (age >= 56) {
                    System.out.println("当前年龄的人是老年");
                }
            } else {
                System.out.println("您的输入非法，请重新输入");
            }
        } while (true);
    }

    public static void main4(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("你输入的数字不是素数");
                return;
            }
        }
        System.out.println("你输入的数字是素数");
    }


    public static void main3(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main2(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main1(String[] args) {
        // Scanner n = new Scanner(in);
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if ((i / 10) % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}