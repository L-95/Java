import java.util.Arrays;
import java.util.SortedMap;

public class Test {

    public static void main(String[] args) {
        /* Array arr = new Array();
        arr.sort();
        System.out.println(Arrays.toString(arr.array));
        System.out.println(Arrays.toString(arr.array1));
        System.out.println("==========交换===========");
        arr.swop();
        System.out.println(Arrays.toString(arr.array));
        System.out.println(Arrays.toString(arr.array1));*/
        Calculator cal = new Calculator(10,20);
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());
        Calculator cal1 = new Calculator(10,20,30);
        System.out.println(cal1.add());
        Swop sw = new Swop(10,20);
        System.out.println(sw.getNum1());
        System.out.println(sw.getNum2());
        System.out.println("==========交换==========");
        sw.swop();
        System.out.println(sw.getNum1());
        System.out.println(sw.getNum2());
        System.out.println("————————————————————————");
        sw.setNum1(11);
        sw.setNum2(12);
        System.out.println(sw.getNum1());
        System.out.println(sw.getNum2());
        System.out.println("==========交换==========");
        sw.swop();
        System.out.println(sw.getNum1());
        System.out.println(sw.getNum2());
    }
}
//交换类
class Swop {
    private int num1;
    private int num2;

    public Swop(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //交换
    public void swop () {
        int tmp = this.num1;
        this.num1 = this.num2;
        this.num2 = tmp;
    }
}
//四则运算类
class Calculator {
    private int num1;
    private int num2;
    private int num3;
    //构造方法的重载
    public Calculator(int num1,int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    //构造方法的重载
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //四则运算
    public int add() {
        return this.num1 + this.num2 + this.num3;
    }
    public int sub() {
        return this.num1 - this.num2;
    }
    public int mul() {
        return this.num1 * this.num2;
    }
    public double div() {
        return  1.0 * this.num1 / this.num2;
    }
}

//数组类
class Array {
    public int[] array;
    public int[] array1;
    private static final int SIZE = 10;

    public  Array() {
        this.array = new int[SIZE];
        this.array1 = new int[SIZE];
        for (int i = 0; i < this.array.length; i ++) {
            this.array[i] = i*2;
            this.array1[i] = i*3;
        }
    }
    //交换两个数组
    public void swop() {
        //比较数组长度，以防越界；
        if (this.array.length < this .array1.length) {
            for (int i = 0; i < this.array.length; i++) {
                int tmp = this.array[i];
                this.array[i] = this.array1[i];
                this.array1[i] = tmp;
            }
        }else if (this.array.length > this.array1.length) {
            for (int i = 0; i < this.array1.length; i++) {
                int tmp = this.array[i];
                this.array[i] = this.array1[i];
                this.array1[i] = tmp;
            }
        }else {
            for (int i = 0; i < this.array.length; i++) {
                int tmp = this.array[i];
                this.array[i] = this.array1[i];
                this.array1[i] = tmp;
            }
        }

    }

    //奇偶性排序
    public void sort() {
        for (int i = 0; i < this.array.length-1; i++) {
            boolean count = true; // 开关； 用于优化比较次数
            for (int j = 0; j < this.array.length-1-i;j++) {
                if ((this.array[j] % 2 != 0) && (this.array[j+1] % 2 == 0)) {
                    int tmp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = tmp;
                    count = false;
                }
            }
            if (count) {
                return;
            }
        }
    }
}
