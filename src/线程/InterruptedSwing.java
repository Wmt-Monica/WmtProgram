package 线程;

import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame {
    /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
    private static final long serialVersionUID =1L;
    Thread thread;

    //定义构造方法
    public InterruptedSwing(){
        //调用父类没有参数的构造方法
        super();
        final JProgressBar progressBar=new JProgressBar();//创造进度条
        //将进度条放置在窗体的北方位
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);//设置进度条上显示数字
        //使用线程对象thread 实现匿名内部类形式初始化
        thread = new Thread(new Runnable() {
            int count=0;

            @Override
            public void run() {//重写run()方法
                while (true){
                    progressBar.setValue(++count);//设置进度条可以显示当前值
                    try {
                        Thread.sleep(100);//使线程休眠1000毫秒

                        /*
                        如果线程是因为使用了sleep()或者wait()方法进入了就绪状态，
                        使用InterruptedException异常来捕获，可以捕获
                         */
                    } catch (InterruptedException e) {
                        System.out.println("当前线程被中断");
                        break;
                    }
                }
            }
        });
        thread.start();//启动线程
        thread.interrupt();//中断线程
    }
    public static void init(JFrame frame,int weight,int height){
        frame.setBounds(500,300,weight,height);//设置窗体的位置和大小
        frame.setVisible(true);//设置窗体可见
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭方式
    }

    public static void main(String[] args) {
        init(new InterruptedSwing(),300,300);//调用init函数
    }

}
