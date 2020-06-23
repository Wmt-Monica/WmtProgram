package 类;

public class StaticMethod {
    static public void one(){
        System.out.println("Hello！ 我是静态方法,可以直接通过我的类名称调用我哦");
    }

    public static void main(String[] args) {
        StaticMethod.one();
    }
}
