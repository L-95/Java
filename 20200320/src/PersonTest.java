public class PersonTest {
    public static void main(String[] args) {
    carreer("lee");

    }

    public static void carreer(String name) {
        Person lee = new Person(name,22,170,115);
        System.out.println("姓名"+lee.getName()+"年龄："+lee.getAge()
                +"身高"+lee.getHigh()+"体重"+lee.getWeight()+"存款"+lee.getDeposit());

        Work work = new Work("敲代码");
        lee.setWork(work);
        int i = 0;
        while(i < 21) {
            work.setTime(i);
            work.setWage(100000*i);
            lee.setDeposit();
            lee.setAge();
            lee.setHigh();
            lee.setWeight();
            i++;
            System.out.println(lee.getName()+"工作了"+lee.getWork().getTime()+"年"
                    +"年薪薪是"+lee.getWork().getWage()+"目前存款为"+lee.getDeposit());
        }
        System.out.println(i+"年后"+"姓名"+lee.getName()+"年龄："+lee.getAge()
                +"身高"+lee.getHigh()+"体重"+lee.getWeight()+"存款"+lee.getDeposit());
    }
}
