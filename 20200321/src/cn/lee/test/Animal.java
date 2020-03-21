package cn.lee.test;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name+"在进食");
    }

    public void move() {
        System.out.println(name+"在奔跑");
    }

    public void sleep() {
        System.out.println(name+"在睡觉");
    }

    public void paly() {
        System.out.println(name+"在玩耍");
    }

    public Animal test() {
        System.out.println("testOverrideAnimal");
        return new Animal("动物");
    }
}
