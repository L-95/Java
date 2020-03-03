package cn.test;

public class test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name="李";
        stu.age=18;
        stu.job="学生";
        System.out.println(stu.name+","+stu.age+","+stu.job);
        stu.sduty();

        Student stu2 = new Student("木子李",20,"码农");
        System.out.println(stu2.name+","+stu2.age+","+stu2.job);
        stu2.action();
    }
}
class Person {
    String name;
    int age;
    String job;
    public void action() {
        System.out.println("吃饭");
        System.out.println("睡觉");
        System.out.println("工作");
    }
}
class Student extends Person {
    public void sduty() {
        System.out.println("学习");
        System.out.println("休息一会");
    }
    public Student(String name,int age,String job) {
        this.name=name;
        this.age=age;
        this.job=job;
    }
    public Student() {
    }
}
