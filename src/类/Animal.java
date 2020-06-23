package 类;

public class Animal {
    //创建一个静态常量
    final static int number=2;
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.one(15,10);
        System.out.println("=====================================");
        Dog dog=new Dog();
        dog.one(10,11);
    }
}
class Cat{
    int black;
    int write;
    public void one(int black,int write){
        this.black=black;
        this.write=write;
        System.out.println("这些猫其中黑猫数量为"+this.black*Animal.number+"这些白猫数量为"+this.write*Animal.number);
        System.out.println("她们表面看上去很高傲，其实你不懂，那是因为她们知道自己太弱了，这是伪装，也是保护");
        System.out.println("她们喜欢吃鱼，喜欢吃小饼干，喜欢慵懒的去晒太阳，喜欢一只猫独处");
    }
}
class Dog{
    int black;
    int write;
    public void one(int black,int write){
        this.black=black;
        this.write=write;
        System.out.println("这些狗其中黑色数量为"+this.black*Animal.number+"这些白色数量为"+this.write*Animal.number);
        System.out.println("他们总是充满了激情，似乎生活处处都是光彩，他们不懂生活的艰辛，很多的不得已");
        System.out.println("他们喜欢吃骨头，喜欢吃小曲奇，喜欢在晴朗的一片草地上奔跑，喜欢和人在一起");
    }
}