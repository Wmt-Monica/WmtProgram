package 内部类;
//静态内部类
public class Four {
    static int a=100;
    static class StaticMain{
        public void Call(){
            System.out.println(a);
        }

        public static void main(String[] args) {
            System.out.println("我是在静态内部类的主方法，是在储存中的静态区执行的主方法");
            StaticMain staticMain=new StaticMain();
            staticMain.Call();
        }
    }
}
