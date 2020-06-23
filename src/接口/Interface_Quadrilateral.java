package 接口;

public interface Interface_Quadrilateral {
    //抽象方法 abstract
    //默认方法 default
    //静态方法 static
    public abstract void Call(String name);
    public abstract void Draw();
    public default void area(){
        System.out.println("这里是接口的默认方法");
    }
    default Double area2(Double weight,Double height){
        System.out.println("在接口没有进行编写哦,我就先返回一个0.0起了");
        return 0.0;
    }
    public static void Empty(){
        System.out.println("我是接口的静态方法，不需要通过实现体来调用我，那样子你也调用不到我，直接可以通过接口来调用就好了");
    }
    //使用私有化Method方法（普通私有默认方法，解决方法之间重复代码问题）
    private void Method(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCC");
    }
    public default void One(){
        System.out.println("我是默认方法one");
        Method();
    }
    public default void two(){
        System.out.println("我是默认方法two");
        Method();
    }
    //使用私有化Method方法（普通私有静态方法，解决方法之间重复代码问题）
    public static void three(){
        System.out.println("我是接口静态方法three");
        Method2();
    }
    public static void four(){
        System.out.println("我是接口静态方法four");
        Method2();
    }
    private static void Method2(){
        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDD");
        System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEE");
        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFF");
    }
    public default void five(){
        System.out.println("我是Interface_Quadrilateral这个接口里面的默认方法");
    }
    //定义一个接口常量，首先要用三个关键字修饰，可以省略
    //格式：public static final 数据类型 常量名称=数据;
    //final关键字一旦进行修饰就不可改变
    public static  final String Interface_Name="我是接口定义的常量,要想调用我很容易，直接接口名称.常量名称";

    //接口是没有静态代码块和构造方法的
//    static {
//
//    }
//    public Interface_Quadrilateral(){
//
//    }
    public abstract void six();
    public default void seven(){

    }
    public default void eight(){
        System.out.println("这里是接口的eight方法，如果子类继承我这个接口的默认方法,");
        System.out.println("同时有与接口里面的默认方法重名起冲突时，由于优先级的缘故，是继承我这个父类的方法的");
    }
}
