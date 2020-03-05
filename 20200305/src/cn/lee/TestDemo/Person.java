package cn.lee.TestDemo;

public class Person {
    public void job() {
        System.out.println("敲代码");
        eat();      //相当于this.eat();调用的是最终对象的eat方法，而不是父类方法
    }
    public void eat() {
        System.out.println("吃饭");
    }
}
