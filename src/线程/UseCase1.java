package 线程;

import javax.swing.*;
import java.awt.*;

public class UseCase1 extends JFrame {
    private static final long serialVersionUID = 1L;

    //设置一个进度条对象
    final JProgressBar progressBar =new JProgressBar();

    //编写构造方法
    public UseCase1(){
        //将进度条添加到面板上去，并设置进度条在面板上的位置设定为居中
        getContentPane().add(progressBar, BorderLayout.CENTER);

        progressBar.setStringPainted(true);//设置进度上可以显示数字

        //创造一个线程对象thread 并连接Runnable()接口
        Thread thread =new Thread(new Runnable() {
            //设置进度条数组变量count
            int count =0;
            @Override
            public void run() {//重写run()方法
                while (true){
                    progressBar.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }

    //设置窗体
    public static void init(JFrame frame,int weight,int height){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(500,300,weight,height);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        init( new UseCase1(),300,100);
    }
}
