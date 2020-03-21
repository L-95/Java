package cn.lee.test;


public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name+"捉老鼠");
    }

    public void move() {
        System.out.println(name+"在跳");
    }

    public Bird test() {
        System.out.println("testOverrideCat");
        return new Bird("鹰");
    }
}
