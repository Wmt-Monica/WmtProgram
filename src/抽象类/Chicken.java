package 抽象类;

public class Chicken extends Bird {
    @Override
    void Eat() {
        System.out.println("小鸡吃小米");
    }

    @Override
    void Move() {
        System.out.println("小鸡移动靠鸡爪");
    }

    @Override
    void Feather() {
        System.out.println("小鸡的羽毛是黄色的");
    }

    @Override
    void Reproduction() {
        System.out.println("鸡的繁殖是靠下蛋的");
    }
}
