package 内部类;

public class ClassInterface {
    //某个类继承内部类的时候，必须硬性的给予这个类的一个带参数的构造方法
    //并且这个构造方法是外部需要继承内部类的引用
    public static class Speak extends A.B{
        public Speak(A a){
            a.super();
        }
    }
}
class A{
    class B{
        public void speak(){
            System.out.println("我是内部类");
        }
    }
}