package 接口;
//注意这里在写继承父类和接口的时候是先继承父类在写接口的不然会报错，注意写的格式
public class Square extends Fu_Achieve implements Interface_Quadrilateral {
    @Override
    public void Call(String name) {
        System.out.println("这里是"+name);
    }

    @Override
    public void Draw() {
        System.out.println("我是正方形，但是我懒得画了");
    }

    @Override
    public Double area2(Double weight, Double height) {
        System.out.println("正方形我可以对此默认方法进行重新编写了");
        double area=weight*height;
        return area;
    }
    //注意：注意如果没有对继承的接口里面的所有抽象方法进行重写，那这个类就只能是抽象类
    @Override
    public void six() {

    }
}
