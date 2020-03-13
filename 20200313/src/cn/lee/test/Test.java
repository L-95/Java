package cn.lee.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(fac(scanner()));
    }
    public static int fac(int num) {
        if (num == 1) {
            return 1;
        }
        return num*fac(num-1);
    }
    //递归求和
    public static void main6(String[] args) {
        System.out.println(sum(scanner()));
    }
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num+sum(num-1);
    }
    //打印一个整数的每一位
    public static void main5(String[] args) {
        printF(scanner());
    }
    public static void printF(int num) {
        if (num<0) {
            System.out.print("-");
            if (-num>9) {
                printF(-num/10);
            }
            System.out.print(-num%10);
            return;
        }else if (num>9) {
            printF(num/10);
        }
        System.out.print(num%10);
    }
    //求一个非负整数的每一项之和
    public static void main4(String[] args) {
        System.out.println(sumNum(scanner()));
    }
    public static int sumNum(int num) {
        if (num<10) {
            return num;
        }
        return num%10+sumNum(num/10);
    }
    //斐波那契数列
    public static void main3(String[] args) {
        System.out.println(fib(scanner()));
    }
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    //汉诺塔
    public static void main2(String[] args) {
        hanoi(scanner(),'A','B','C');
    }
    public static void move(char flag1,char flag3) {
        System.out.print(flag1+"-->"+flag3+" ");
    }
    public static void hanoi(int n,char flag1,char flag2,char flag3) {
        if (n == 1) {
            move(flag1,flag3);
            return;
        }
        hanoi(n-1,flag1,flag3,flag2);
        move(flag1,flag3);
        hanoi(n-1,flag2,flag1,flag3);
    }
    //跳台阶
    public static void main1(String[] args) {
        System.out.println(stpes(scanner()));
    }
    public static int stpes(int n) {
        if (n/1==0 || n/2==0) {
            return 1;
        }
        return stpes(n-1)+stpes(n-2);
    }
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
