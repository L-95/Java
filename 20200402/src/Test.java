public class Test {
    public static void main(String[] args) {
        LinkedList tmp = new LinkedList();
//        tmp.addFirst(0);
//        tmp.addFirst(1);
//        tmp.addFirst(2);
//        tmp.addFirst(3);
//        tmp.headDisplay();
//        tmp.clear();
        tmp.addLast(0);
        tmp.addLast(77);
        tmp.addLast(77);
        tmp.addLast(77);
        System.out.println("删除前");
        tmp.lastDisplay();
//        tmp.addAll(0,777);
//        tmp.addAll(2,888);
//        tmp.addAll(3,999);
//        tmp.headDisplay();
//        System.out.println(tmp.findKey(888));
//        System.out.println(tmp.findKey(88));
//        tmp.remove(777);
//        tmp.remove(888);
//        tmp.remove(999);
//        tmp.headDisplay();

        tmp.removeAllKey(77);
        System.out.println("删除后");
        tmp.headDisplay();

    }
}
