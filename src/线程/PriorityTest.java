package 线程;

import javax.swing.*;
import java.awt.*;

public class PriorityTest extends JFrame {
    private static final long serialVersionUID =1L;
    //创建四个线程对象
    private Thread thread1;
    private Thread thread2;
    private Thread thread3;
    private Thread thread4;

    //创造构造方法PriorityTest
    public PriorityTest(){
        //设置四个线程进度条的布局方式  (网格式布局，四行一列)
        getContentPane().setLayout(new GridLayout(4,1));

        //实例化四个线程，采用进度条来实例化线程
        final JProgressBar progressBar1=new JProgressBar();
        final JProgressBar progressBar2=new JProgressBar();
        final JProgressBar progressBar3=new JProgressBar();
        final JProgressBar progressBar4=new JProgressBar();

        //将四个进度条组件添加到面板上去
        getContentPane().add(progressBar1);
        getContentPane().add(progressBar2);
        getContentPane().add(progressBar3);
        getContentPane().add(progressBar4);

        //设置进度条显示数值
        progressBar1.setStringPainted(true);
        progressBar2.setStringPainted(true);
        progressBar3.setStringPainted(true);
        progressBar4.setStringPainted(true);

        //重复多次重写run()方法会导致程序累赘，这里可以写一个实现Runnable重写run()
        thread1 = new Thread(new MyThread(progressBar1));
        thread2 = new Thread(new MyThread(progressBar2));
        thread3 = new Thread(new MyThread(progressBar3));
        thread4 = new Thread(new MyThread(progressBar4));

        //采用setPriority()方法，输入线程名称，线程的优先级，和启动线程
        setPriority("thread1",5,thread1);
        setPriority("thread2",4,thread2);
        setPriority("thread3",3,thread3);
        setPriority("thread4",3,thread4);
    }

    //定义设置线程的名称，优先级方法
    public static void setPriority(String threadName, int priority,Thread thread){
        thread.setPriority(priority);//设置线程的优先级
        thread.setName(threadName);//设置线程的名称
        thread.start();//启动线程
    }

    //写一个实现Runnable接口，对run()方法进行重写
    private final class MyThread implements Runnable{
        //将线程对象指向这个类中的线程对象
        private final JProgressBar progressBar;
        private MyThread(JProgressBar progressBar) {
            this.progressBar = progressBar;
        }

        int count=0;//设置进度条加载的自增变量
        @Override
        public void run() {//重写run()方法
            while (true){
                progressBar.setValue(count+=10);//设置进度条上显示的数值每次自增10
                try {
                    Thread.sleep(1000);//设置线程休眠的时间为1000毫秒
                } catch (InterruptedException e) {
                    System.out.println("该线程被停止了");
                }
            }
        }
    }

    //设置窗体
    public static void init(JFrame frame,int weight,int height){
        frame.setBounds(500,300,weight,height);
        frame.setVisible(true);//设置窗体可见
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体的关闭方式
    }

    //用主函数调用init()函数
    public static void main(String[] args) {
        init(new PriorityTest(),300,300);
    }
}
