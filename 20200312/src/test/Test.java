package test;

import java.util.Scanner;
public class Test {
    //汉诺塔
    public static void main(String[] args) {
        System.out.print("请输入汉诺塔要移动的盘子的数量：");
        hanoi(scanner(),'A','B','C');
        System.out.println();
    }
    public static void hanoi(int n,char flag1, char flag2, char flag3) {
        if (n==1) {
            move(flag1,flag3);
            return;
        }
        hanoi(n-1,flag1,flag3,flag2);
        move(flag1,flag3);
        hanoi(n-1,flag2,flag1,flag3);
    }
    public static void move(char flag1,char flag3) {
        System.out.print(flag1+"->"+flag3+" ");
    }




    //打印一个int类型数字的每一位
    public static void print(int num) {
        if (num<0) {
            System.out.print("-");
        }else if (num==0) {
            System.out.print(num);
        }
        while(num>0) {
            System.out.print(num%10+" ");
            num=num/10;
        }
    }



    //插入排序
    public static void main2(String[] args) {
        int[] arr = {1,3,6,4,9,2,4,5,8};
        sort(arr);
        for (int i = 0;i<arr.length;i++ ) {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr) {
        if (arr!=null&&arr.length>0) {
            for (int i = 0;i<arr.length-1;i++) {
                for (int j = i+1;j > 0;j--) {
                    //按奇偶性排序
                    if (arr[j]%2!=0&&arr[j-1]%2==0) {//if(arr[j]<arr[j-1]) 按大小顺序排序
                        int tmp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = tmp;
                    }
                }
            }
        }
    }

    //二进制中1的个数
    public static void main1(String[] args) {
        int n = scanner();
        System.out.println(numberOf1(n));

    }
    public static int numberOf1(int n) {
        int count = 0;
        while(n!=0) {
            /*if ((n&1)==1) {
                count++;
            }
            n=n>>>1;*/
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
