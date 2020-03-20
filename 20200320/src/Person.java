public class Person {
    private String name;
    private int age;
    private int high;
    private int weight;
    private int deposit;
    private Work work;

    public Person(String name, int age, int high, int weight) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age += this.getWork().getTime();
    }

    public int getHigh() {
        return high;
    }

    public void setHigh() {
        this.high += this.getWork().getTime()*1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight +=this.getWork().getTime()*2 ;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public void setDeposit() {
        this.deposit += this.getWork().getWage();
    }

    public int getDeposit() {
        return deposit ;
    }
}
