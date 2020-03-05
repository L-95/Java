package cn.lee.TestDemo;

//测试多态: 继承 重写 父类引用指向子类对象；

public class TestPolymor {
    public static void main(String[] args) {
        Person s = new Boy();   //父类引用指向子类对象
        s.job();
    }
}
