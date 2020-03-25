public class TestDemo {
    public static void main(String[] args) {
        OrderList test = new OrderList();
        test.add(0,2);
        test.add(1,3);
        test.add(2,4);
        test.remove(4);
        test.display();
        System.out.println(test.contains(1));


    }
}
