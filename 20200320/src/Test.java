public class Test {
    public static void main(String[] args) {
        Point p = new Point(0,0);
        System.out.println("当前坐标为:("+p.getX()+","+p.getY()+")");
        p.setX(2);
        System.out.println("移动后的坐标为:("+p.getX()+","+p.getY()+")");

        p.setX(3);
        p.setY(3);
        System.out.println("移动后的坐标为:("+p.getX()+","+p.getY()+")");
    }
}

































/*
protected class Test{

    private String name = "Person";

    int age=0;

}

public class Child extends Test{

    public String grade;

    public static void main(String[] args){

        Test p = new Child();

        System.out.println(p.name);

    }

}*/
/*public class Test{

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String args[]){

        Test t=new Test();
    }
}*/

/*class Test1 {
    public static void hello() {
        System.out.println("hello");
    }
}*/
/*public class Test {
    static int i = 0;
        public int aMod(){
            i++;
            return i;
        }
        public static void main(String args[]){
            Test test = new Test();
            int k = test.aMethod();
            int j = test.aMethod();
            System.out.println(j);
        }*/
  /*  public static void main2(String[] args){

        String s;

        System.out.println("s="+s);

    }*/
//    public static void main1(String[] args) {
//        // TODO Auto-generated method stub
//        Test1 test=null;
//        test.hello();
//    }