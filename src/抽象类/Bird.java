package 抽象类;

public abstract class Bird extends Animal {
    public void Kind(String kind){
        System.out.println("我们创建了一只"+kind+"动物");
    }
    abstract void Eat();
    abstract void Move();
    abstract void Feather();
    abstract void Reproduction();
}
