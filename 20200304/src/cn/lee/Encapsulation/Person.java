package cn.lee.Encapsulation;

public class Person {
        private String name;
        private String job;
        private int age;
        private int hight;

        public void setName(String name){
            this.name=name;
            System.out.println(name);
        }
        public void setJob(String job) {
            this.job=job;
            System.out.println(job);
        }
        public void setAge(int age) {
            if (age>0&&age<150) {
                this.age=age;
                System.out.println(age);
            } else {
                System.out.println("你的输入非法！");
            }
        }
        public void setHight(int hight) {
            if (hight>30&&hight<350) {
                this.hight=hight;
                System.out.println(hight);
            } else {
                System.out.println("你的输入非法！");
            }
        }
        public String getName() {
            return this.name="lee";
        }
        public String getJob() {
            return this.job="student";
        }
        public int getAge() {
            return this.age=11;
        }
        public int getHight() {
            return this.hight=132;
        }
    }
