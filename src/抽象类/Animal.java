package 抽象类;

public abstract class Animal {
    //构造方法
    public void Animal(){
        System.out.println("我们创建了一只动物");
    }
    abstract public void Kind(String kind);
}
