package 内部类;

public class One {
    //成员方法
    public void Method(){
        System.out.println("我是成员方法");
    }
    //成员内部类
    class InClass{
        //内部类方法
        public void InMethod(){
            System.out.println("我是内部类方法,调用我的时候要创建内部类的对象");
            System.out.println("需要使用用外部类对象来先调用内部类，才能调用内部类的方法");
        }
    }

    public static void main(String[] args) {
        //创建成员内部类的的对象
        One in=new One();
        //调用类中的成员方法
        in.Method();
        //创建成员内部类的对象
        One.InClass in2=in.new InClass();
        //调用成员内部类的类方法
        in2.InMethod();
    }
}
