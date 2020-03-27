public class Test {
    public static void main(String[] args) {
        SingleList sing = new SingleList();
//        sing.addFirst(1);
        sing.addLast(1);
        sing.addFirst(2);
        sing.addFirst(1);
        sing.addFirst(2);
        sing.display();
        System.out.println();
        sing.removeAllKey(2);
        System.out.println("=======");
        sing.display();
    }
}
