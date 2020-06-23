package 继承;

public class Technology {
    public static void main(String[] args) {
        Computer computer=new Computer("台式电脑");
        System.out.println(computer.name);
        computer.Open();
        computer.ShowPicture();
        System.out.println("=======================================");
        Table_PC table_pc=new Table_PC("平板电脑");
        System.out.println(Table_PC.name);
        System.out.println(Table_PC.battery);
        table_pc.Open();
        table_pc.Open3G();
        table_pc.ShowPicture();
        Three three=new Three();
        three.Say();
    }
    static class One{
        void Say(){
            System.out.println("一个子类不能同时继承多个父类，只能继承一个父类，但是可以嵌套继承");
        }
    }
    static class Two extends One{ }
    static class Three extends Two{ }
}
