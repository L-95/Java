package cn.lee.test;

public class Test {
    //引用指向另一个引用
    public static void main(String[] args) {
        //实例化丈夫对象
        Husband sl = new Husband();
        //命名
        sl.name = "李";
        sl.age = 25;
        Job jobL = new Job();
        sl.job = jobL;
        sl.job.address = "西安";
        sl.job.nature = "码农";
        sl.job.setJob("敲代码");
        //实例化妻子对象
        Wife dw = new Wife();
        //命名
        dw.name = "高";
        dw.age = 26;
        Job jobW = new Job();
        dw.job = jobW;
        dw.job.address = "西安";
        dw.job.nature = "老师";
        dw.job.setJob("讲课");
        //“结婚”：能通过丈夫找到妻子 也能通过妻子找到丈夫
        sl.w = dw;
        dw.lee = sl;

        System.out.println(sl.name+"的对象是"+sl.w.name);
        System.out.println("年龄；"+sl.w.age);
        System.out.println("工作：" + sl.w.job.nature);
        System.out.println("工作地点" + sl.w.job.address);
        System.out.println("工作性质" + sl.w.job.getJob());
        System.out.println(dw.name+"的对象是"+dw.lee.name);
        System.out.println("年龄；"+dw.lee.age);
        System.out.println("工作：" + dw.lee.job.nature);
        System.out.println("工作地点" + dw.lee.job.address);
        System.out.println("工作性质" + dw.lee.job.getJob());

    }
}

class Husband {
    //姓名
    String name;
    //年龄
    int age;
    //丈夫对象当中含有妻子引用
    Wife w;
    //工作
    Job job;
}
class Wife {
    //姓名
    String name;
    //年龄
    int age;
    //妻子对象当中含有丈夫引用
    Husband lee;
    //工作
    Job job;
}
class Job {
    // 工作地点
    String address;
    //工作性质
    String nature;
    //工作内容
    private String job;

    public String getJob() {
        return this.job;
    }
    //工作内容
    public void setJob(String job) {
         this.job = job;
    }
}