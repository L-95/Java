class SSp {
    private void dome() {
        System.out.println("11111111111");
    }
    public void asd(SSp s) {
        s.dome();
    }
}

public class Super extends SSp {
    @Override
    private void dome() {
        System.out.println("22222222");
    }
    public static void main(String[] args) {
        Super s = new Super();
        s.asd(s);
        System.out.println("333333333");
    }
}
