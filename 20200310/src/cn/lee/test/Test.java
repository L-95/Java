package cn.lee.test;

import java.util.Scanner;

/**
 *  科目：递归练习；
 *  日期:20200310；
 */

public class Test {
    //矩形覆盖
    public static void main(String[] args) {
        int n = scanner();
        System.out.println(RectCover(n));
    }
    public static int RectCover(int n) {
        if(n ==0) {
            return 0;
        }else if(n == 1 ) {
            return 1;
        }else if (n == 2) {
            return 2;
        }
        return RectCover(n-1)+RectCover(n-2);
    }

    //青蛙跳台阶
    public static void main4(String[] args) {
        int n = scanner();
        System.out.println(jumpFloor(n));
    }
    public static int jumpFloor(int target) {

        if (target/1==0 || target/2==0) {
                return 1;
        }
        return jumpFloor(target-1)+jumpFloor(target-2);
    }


    //递归求斐波那契数
    public static void main3(String[] args) {
        int n = scanner();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n==0) {
            return 0;
        }else if(n==1) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //递归求阶乘
    public static void main2(String[] args) {
        int n = scanner();
        System.out.println(fac(n));
    }
    public static int fac(int n) {
        if (n==1) {
            return 1;
        }
        return n*fac(n-1);
    }

    //递归求和
    public static void main1(String[] args) {
        int n = scanner();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n==1) {
            return 1;
        }
        return n+sum(n-1);
    }
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
