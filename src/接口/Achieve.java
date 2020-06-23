package 接口;

public class Achieve {
    public static void main(String[] args) {
        //接口是不能被直接创建一个对象的，要使用“实现体”来“实现”该接口
        Square square=new Square();
        Oblong oblong=new Oblong();
        square.Call("正方形");
        square.Draw();
        oblong.Call("长方形");
        oblong.Draw();
        System.out.println("================================");
        System.out.println("下面来看一下，面对接口升级时，我们不需要对接口重新编写，在实现体找不到，就会去接口去寻找");
        System.out.println("================================");
        square.area();
        oblong.area();
        System.out.println("================================");
        System.out.println("下面来实现默认方法实现体的覆盖重写");
        System.out.println("================================");
        System.out.println(square.area2(3.0,3.0));
        System.out.println(oblong.area2(2.0,3.0));
        System.out.println("================================");
        //接口的静态方法，不需要通过实现体来调用我，那样子你也调用不到我，直接可以通过接口来调用就好了
        Interface_Quadrilateral.Empty();
        System.out.println("================================");
        System.out.println("以下是接口的默认方法的调用，演示重复代码的私有化");
        square.One();
        square.two();
        System.out.println("================================");
        System.out.println("以下是接口的静态方法的调用，演示重复代码的私有化");
        Interface_Quadrilateral.three();
        Interface_Quadrilateral.four();
        System.out.println("================================");
        //接口定义的常量,要想调用很容易，直接接口名称.常量名称
        System.out.println(Interface_Quadrilateral.Interface_Name);
        System.out.println("================================");
        System.out.println("现在来看一下Oblong类连接到了连个接口的实现吧");
        oblong.five();
        oblong.Five();
        System.out.println("================================");
        //因为连接的两个接口有相同的抽象方法，所以我在连接到这两个接口的类要对这个重复的抽象方法进行覆盖重写
        //如果两个接口里面有相同的抽象类，就只需要覆盖一次即可
        System.out.println("下面来看一下对于两个而接口重复了的抽象方法重写后的效果");
        oblong.six();
        System.out.println("================================");
        //如果继承的两个接口有相同的默认方法，就会起冲突，所以就需要对这个默认方法进行重写
        oblong.seven();
        System.out.println("================================");
        //这里是父类的eight方法，如果子类继承我这个父类的方法，同时有与接口里面的默认方法重名起冲突时，
        // 由于优先级的缘故，是继承我这个父类的方法的
        square.eight();

    }
}
