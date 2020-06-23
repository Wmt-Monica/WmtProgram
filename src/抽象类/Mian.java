package 抽象类;

public class Mian {
    public static void main(String[] args) {
        //抽象的父类不能直接创建实体，只能通过子类来实现
        Animal animal=new Seagull();
        animal.Kind("海鸥");
        ((Seagull) animal).Eat();
        ((Seagull) animal).Move();
        ((Seagull) animal).Feather();
        ((Seagull) animal).Reproduction();
        System.out.println("================================");
        //或者不通过父类来创建对象，用子类创建对象
        Chicken chicken=new Chicken();
        animal.Kind("小鸡");
        chicken.Eat();
        chicken.Move();
        chicken.Feather();
        chicken.Reproduction();
    }
}
