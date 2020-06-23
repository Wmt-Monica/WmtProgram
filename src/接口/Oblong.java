package 接口;
//一个类只能继承一个父类但是可以实现多个接口哦,两个接口用逗号隔开即可
public class Oblong implements Interface_Quadrilateral,Interface_two {
    @Override
    public void Call(String name) {
        System.out.println("这里是"+name);
    }

    @Override
    public void Draw() {
        System.out.println("我是长方形，但是我懒得画");
    }
    //因为连接的两个接口有相同的抽象方法，所以我在连接到这两个接口的类要对这个重复的抽象方法进行覆盖重写
    //如果两个接口里面有相同的抽象类，就只需要覆盖一次即可
    @Override
    public void six() {
        System.out.println("因为连接的两个接口有相同的抽象方法，所以我在连接到这两个接口的类要对这个重复的抽象方法进行覆盖重写");
        System.out.println("如果两个接口里面有相同的抽象类，就只需要覆盖一次即可");
    }
    //如果继承的两个接口有相同的默认方法，就会起冲突，所以就需要对这个默认方法进行重写
    @Override
    public void seven() {
        System.out.println("我是在类Oblong里面重新写的seven默认方法：因为如果继承的两个接口有相同的默认方法，就会起冲突，所以就需要对这个默认方法进行重写");
    }
}
