package cn.lee.Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Person boy= new Person();
        System.out.println(boy.getName());
        System.out.println(boy.getAge());
        System.out.println(boy.getHight());
        System.out.println(boy.getJob());

        System.out.println("___________________");

        boy.setName("Lee");
        boy.setAge(10);
        boy.setHight(120);
        boy.setJob("Student");
    }
}

