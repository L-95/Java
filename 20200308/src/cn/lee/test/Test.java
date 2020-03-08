package cn.lee.test;

import java.util.Scanner;

public class Test {

    //递归的简单认识
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }

    //求阶乘
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n*fac(n-1);
    }

    //方法的调用、重载、嵌套
    public static void main0(String[] args) {
        System.out.println("请输入两个整数");
        Scanner sc0 = new Scanner(System.in);
        int num0 = sc0.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int ret0 = max(num0,num1);
        System.out.println(ret0);
        System.out.println("最大值是："+ret0);

        System.out.println("请输入三个整数");
        Scanner n0 = new Scanner(System.in);
        int num3 = n0.nextInt();
        Scanner n1 = new Scanner(System.in);
        int num4 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int num5 = n2.nextInt();
        int ret1 = max(num3,num4,num5);
        System.out.println(ret1);
        System.out.println("最大值是："+ret1);
    }

    //比较两个数的大小
    private static int max(int num0, int num1) {
        return  num0>num1?num0:num1;
    }
    private static int max(int num0,int num1,int num2) {
        return  manx(max(num0,num1),num2);
    }
}
