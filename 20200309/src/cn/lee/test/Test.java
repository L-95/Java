package cn.lee.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] n = {2,4,6,8,8,8,1};
        for(int i = 1; i<n.length;i++) {
            for (int j = 0;j<n.length-i;j++) {
                if (n[j]%2==0) {
                    int tmp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = tmp;
                }
            }
        }
        for (int i = 0;i<n.length;i++) {
            System.out.println(n[i]);
        }
    }

    public static void main12(String[] args) {
        System.out.println("请输入两个整数");
        int n = scannerInt();
        int m = scannerInt();
        System.out.println(sum(n,m));
        System.out.println("请输入三个小数");
        double a = scanner1Double();
        double b = scanner1Double();
        double c = scanner1Double();
        System.out.println(sum(a,b,c));
    }
    public static int sum(int n,int m) {
        return n+m;
    }
    public static double sum(double a,double b,double c) {
        return a+b+c;
    }
    public static void main11(String[] args) {
        System.out.println("请输入两个小数一个整数：");
        double a = scanner1Double();
        double b = scanner1Double();
        int c = scannerInt();
        System.out.println(max(a,b,c));

        System.out.println("请输入两个小数：");
        double d = scanner1Double();
        double e = scanner1Double();
        System.out.println(max(d,e));

        System.out.println("请输入两个整数：");
        int n = scannerInt();
        int m = scannerInt();
        System.out.println(max(n,m));
    }

    public static int max(int n,int m) {
        return n > m ? n : m;
    }
    public static double max(double n,double m) {
        return n > m ? n : m;
    }
    public static double max(double a,double b,int c) {
        return max(a,b) > c ? max(a,b) : c;
    }
    public static int max(int a,int b,int c) {
        return max(max(a,b),c);
    }
    public static int  scannerInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static double scanner1Double() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static void main10(String[] args) {
        System.out.println("请输入两个整数：");
        int n = scannerInt();
        int m = scannerInt();
        System.out.println("最大值为："+max(n,m));
        System.out.println("请输入三个整数：");
        int a = scannerInt();
        int b = scannerInt();
        int c = scannerInt();
        System.out.println("最大值为："+max(a,b,c));
    }


    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( fac(n));
    }

    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facSum(n));
    }
    public static int facSum(int n) {
        int sum = 0;
        for (int i = 1;i <= n;i++) {
            sum += fac(i);
        }
       return sum;
    }
    public static int fac (int n) {
        int ret = 1;
        for (int i = 1;i <= n;i++) {
            ret *= i;
        }
        return ret;
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }
    public static int fib(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 2;
        for (int i = 1;i < n;i++) {  //当要输出第二项及之后的项时，才开始交换。
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
        return fib1;
    }
    public static void main5(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
        int d = 3;
        int e = 3;
        int ret = fund(a,b,c);
        System.out.println(ret);
        //随着数据的增多，可以重载方法来进行求解
        int ret1 = fund(a,b,c,d,e);
        System.out.println(ret1);
    }
    public static int fund(int a,int b,int c) {
        if (a != b && a != c) {
            return a;
        }else if (b != a && b != c){
            return b;
        }else {
            return c;
        }
    }
    public static int fund(int a,int b,int c,int d,int e) {
        return fund(fund(a,b,c),d,e);
    }


    public static void main4
            (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num){
        for (int i = 1;i <= num;i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }


    public static void main3(String[] args) {
        int num = 123;
        printNum(num);
    }
    public static void printNum(int num) {
        if (num > 9) {
            printNum(num/10);
        }
        System.out.print(num%10+" ");
    }
    public static void main2(String[] args) {
        String tmp = "lee123";
        logIn(tmp);
    }
    public static void logIn(String tmp) {
        int count = 3;
        while (count != 0) {
            System.out.println("请输入密码：");
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            if (tmp.equalsIgnoreCase(n)) {
                System.out.println("登陆成功");
                break;
            }else {
                count--;
                System.out.println("密码错误,您还有"+count+"次机会。");
            }
        }
    }


    //获取一个整数的二进制序列 并分别输出偶数位和奇数位
    public static void main1(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        binary(num);
    }
    public static void binary(int num) {
        System.out.print("二进制序列偶数位为：");
        for (int i = 31;i >=1 ;i-=2) {
            System.out.print((num>>>i)&1);
        }
        System.out.println();
        System.out.print("二进制序列奇数位为：");
        for (int i = 30;i >=0 ;i-=2) {
            System.out.print((num>>>i)&1);
        }
    }
}
