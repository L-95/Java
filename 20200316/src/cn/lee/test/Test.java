package cn.lee.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //奇偶性排序，保持元素相对位置不变(优化版)
    public static void main(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        System.out.println(Arrays.toString(arr));
        sort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort1(int[] arr) {
        int n = 0;
        for (int i = 0;i < arr.length-1;i++) {
            int count = 0;
            for (int j = 0;j < arr.length-1-i;j++) {
                n++;
                if ((arr[j] & 1) == 1 &&(arr[j+1] & 1) == 0) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        System.out.println("总共交换了"+n+"次");
    }
    //快速奇偶性排序
    public static void main4(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low < high) {
            while((low < high) && (arr[low] & 1) == 0) {
                low++;
            }
            while((low < high) && (arr[high] & 1) == 1) {
                high--;
            }
            if (low<high) {
                int tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
            }
        }
    }
    //数组逆序
    public static void main3(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        System.out.println(Arrays.toString(arr));
        reverseOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseOrder(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low < high) {
            int tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            low++;
            high--;
        }
    }

    //二维数组元素查找
    public static void main2(String[] args) {
        int find = 6;
        int[][] array = new int[][]{{1,3,5,7},{2,4,6,8}};
        System.out.println(findNum(array,find));
    }
    public static boolean findNum(int[][] arr, int find) {
        int line = arr.length-1;
        int row = 0;
        while(row < arr[0].length && line >= 0 ) {
            if (arr[line][row] < find) {
                row++;
            }else if (arr[line][row] > find) {
                line--;
            }else {
                return true;
            }
        }
        return false;
    }
    //二分法查找二维数组中的元素
    public static void main1(String[] args) {
        int target = 6;
        int[][] array = new int[][]{{1,3,5,7},{2,4,6,8}};
        System.out.println(binarySearch(target, array));
    }
    public static boolean binarySearch(int target, int [][] array) {
        int i = 0;
        while (i < array.length) {
            int low = 0;
            int high = array[i].length-1;
            while(low < high) {
                int mid = (low+high)/2;
                if (array[i][mid] < target) {
                    low = mid + 1;
                }else if (array[i][mid] > target) {
                    high = mid -1;
                }else {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void init(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }
}
