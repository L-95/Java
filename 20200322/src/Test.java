public class Test {
    public static void main(String[] args) {
        myArrayList();
    }
    public static void myArrayList() {
        MyArrayList elem = new MyArrayList();
        //打印顺序表
        elem.print();
        //在指定pos位置新增元素data
        elem.add(0,10);
        elem.print();
        System.out.println("===========");
        elem.add(1,20);
        elem.print();
        System.out.println("===========");
        elem.add(2,30);
        elem.print();
        System.out.println("===========");
        elem.add(3,40);
        elem.print();
        System.out.println("===========");
        //判断是否包含
        System.out.println(elem.contains(20));
        System.out.println("===========");
        //查找元素位置
        System.out.println(elem.search(20));
        System.out.println("===========");
        //获取pos位置的元素
        System.out.println(elem.getPos(2));
        System.out.println("===========");
        //将pos位置的元素设置为value
        elem.setPos(0,100);
        elem.print();
        System.out.println("===========");
        //删除第一次出现的元素key
        elem.remove(20);
        elem.print();
        System.out.println("===========");
        //获取顺序表长度
        System.out.println(elem.size());
        System.out.println("===========");
        //清空顺序表
        elem.clear();
        elem.print();
    }
}
