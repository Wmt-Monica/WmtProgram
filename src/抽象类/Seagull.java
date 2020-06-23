package 抽象类;

public class Seagull extends Bird {

    @Override
    void Eat() {
        System.out.println("海鸥吃鱼");
    }

    @Override
    void Move() {
        System.out.println("海鸥靠飞翔");
    }

    @Override
    void Feather() {
        System.out.println("海鸥的羽毛是白色的");
    }

    @Override
    void Reproduction() {
        System.out.println("海鸥是靠下蛋来繁殖的");
    }
}
