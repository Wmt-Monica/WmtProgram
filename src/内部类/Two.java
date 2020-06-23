package 内部类;

public class Two {
    //在调用类中的局部内部类时，需要用到接口向上返回值
    public OutInterface OverMethod(){

        class InMethod implements OutInterface{
            //创建内部类的构造方法
             InMethod (String name){
                System.out.println("我是局部内部类");
                System.out.println("我叫"+name+"猪");
            }
        }
        //用new 一个类的方法来做返回值
        return new InMethod("李寅");
    }

    public static void main(String[] args) {
        Two two=new Two();
        two.OverMethod();
    }
}
//定义一个接口
interface OutInterface{

}