package 多态;

public class Animal {
     void Move(){

    }
    static class Fish extends Animal{
         void Move(){
            System.out.println("游泳");
        }
    }
    static class Tiger extends Animal{
         void Move(){
             System.out.println("奔跑");
         }
    }
    static class Eagle extends Animal{
         void Move(){
             System.out.println("飞翔");
         }
    }

    public static void main(String[] args) {
         //同一个Move()方法，不同的表现形式
        Animal animal=new Fish();
        animal.Move();
        System.out.println("=============================");
        animal=new Tiger();
        animal.Move();
        System.out.println("=============================");
        animal=new Eagle();
        animal.Move();
    }
}
