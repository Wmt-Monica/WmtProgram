package 类;

public class StaticTest {
    static{
        System.out.println("静态方法是第一个运行的");
    }
    {
        System.out.println("非静态方法是第二个运行的");
    }
    public StaticTest(){
        System.out.println("构造方法是第三个运行的");
    }
    public void show(){
        System.out.println("成员方法是第四个运行的");
    }

    public static void main(String[] args) {
        //构造方法
        StaticTest test=new StaticTest();
        test.show();
    }
}
