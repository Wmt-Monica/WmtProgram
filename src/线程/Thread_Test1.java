package 线程;

//继承Thread类
public class Thread_Test1 extends Thread{
    //设置私有的count变量
    private int count=10;

    //继承Thread需要重写run方法
    public void run(){
        while (true){
            System.out.println(count+" ");//打印count变量
            if(--count==0){//使count变量自减，当自减为0时，退出循环
                return;
            }
        }
    }
    public static void main(String[] args) {
        //在启动新线程时，需要使用Thread类中的start()方法，而不要直接调用run()方法
        new Thread_Test1().start();
    }
}
