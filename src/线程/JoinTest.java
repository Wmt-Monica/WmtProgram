package 线程;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    /*
        制作两个进度条
     */
     /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
     private static final long serialVersionUID=1L;
     //定义两个线程
    private Thread thread1;
    private Thread thread2;
    //定义两个进度条组件 JProgressBar类是Java组件中实现进度条的类
    final JProgressBar progressBar1 =new JProgressBar();
    final JProgressBar progressBar2 =new JProgressBar();
    //定义成员变量
    int count=0;

    //定义构造方法JoinTest()
     public JoinTest(){
         //super( ) ( 这种形式指的是：调用父类没有参数的构造方法（也叫构造函数）注意：
         // 这里super( ) 只能放在子类的构造方法里面，并且只能放在构造方法的首句)
         super();
         //将进度条设置在窗体最北面  利用画板ContentPane，将组件进度条设置在整个面板的北边
         getContentPane().add(progressBar1, BorderLayout.NORTH);
         //将进度条设置在窗体最南面  利用画板ContentPane，将组件进度条设置在整个面板的男边
         getContentPane().add(progressBar2,BorderLayout.SOUTH);
         //设置进度条可以显示数字字符
         progressBar1.setStringPainted(true);
         progressBar2.setStringPainted(true);

         //使用线程对象thread1实现匿名内部类形式初始化Thread实例
         thread1 = new Thread(new Runnable() {
             //设置变量count;
             int count=0;
             @Override
             public void run() {//重写run()方法
                 while (true){
                     progressBar1.setValue(++count);//设置进度条的当前值
                     try {
                         Thread.sleep(100); //使线程thread1休眠100毫秒
                         /*
                         因为在很多情况下，主线程生成并起动了子线程，如果子线程里要进行大量的耗时的运算，
                         主线程往往将于子线程之前结束，但是如果主线程处理完其他的事务后，需要用到子线程
                         的处理结果，也就是主线程需要等待子线程执行完成之后再结束，这个时候就要用到join()方法了。
                          */
                         thread2.join();  //使线程thread2调用join()方法
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
         });
         thread1.start();//启动线程A

         //使用线程对象thread2实现匿名内部类形式初始化Thread实例
         thread2 =new Thread(new Runnable() {
             //设置变量count
             int count=0;
             @Override
             public void run() {//重写run方法
                 while (true){
                     progressBar2.setValue(++count);//设置进度条的当前值
                     try {
                         Thread.sleep(100);//使线程2休眠100毫秒
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     if(count==100)//当count变量增长100时
                         break;
                 }
             }
         });
         thread2.start();//启动线程2
     }

     //设置窗体各种属性
     public static void init(JFrame frame,int width,int height){
         frame.setBounds(500,300,width,height);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

     //调用主方法
     public static void main(String[] args) {
         init(new JoinTest(),100,100);
     }
}
