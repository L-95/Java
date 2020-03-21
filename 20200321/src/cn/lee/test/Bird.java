package cn.lee.test;

public class Bird extends Animal {
    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name+"抓兔子");
    }

    public void move() {
        System.out.println(name+"在飞");
    }
}
