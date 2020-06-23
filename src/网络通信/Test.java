package 网络通信;

public class Test{
    private int value = 0;
    private int limit = 0;

    public Test(int limit) {
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }
    //public static void f() {
    //	value++;
    //}

    public static void main(String[] args) {
        Test d = new Test(24);
        //d.value++;
        for ( ; ; ) {
            d.increase();
            System.out.println(d.getValue());
        }

    }
}