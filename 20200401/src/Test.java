public class Test {
    public static void main(String[] args) {
        LinkedList tmp = new LinkedList();
        tmp.addFirst(0);
        tmp.addFirst(1);
        tmp.addFirst(2);
        tmp.addFirst(3);
        tmp.headDisplay();
        tmp.clear();
        tmp.addLast(0);
        tmp.addLast(1);
        tmp.addLast(2);
        tmp.addLast(3);
        tmp.lastDisplay();
        tmp.addAll(0,777);
        tmp.addAll(2,888);
        tmp.addAll(3,999);
        tmp.headDisplay();
    }
}
