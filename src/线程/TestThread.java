package 线程;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestThread extends JFrame {
    private static final long serialVersionUID = 1L;
    JPanel jPanel1=new JPanel();//设置一个面板

    JButton button1 = new JButton("开始");//设置两个按钮，开始和停止
    JButton button2 = new JButton("停止");

    //设置一个布尔变量
    private boolean isContinue;

    //实例化MyThread对象
    MyThread thread = null;

    //编写该类的构造方法
    public TestThread(){
        try{
            WmtButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //设置窗口的两个按钮 开始按钮，停止按钮
    private void WmtButton() throws Exception{//抛出异常
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.setText("start");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton_actionPerformed(e);
            }
        });
        button2.setText("stop");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopButton_actionPerformed(e);
            }
        });
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);
        jPanel1.add(button1);
        button1.setBounds(36, 105, 82, 30);
        jPanel1.add(button2);
        button2.setBounds(160, 108, 100, 31);
    }

    //为两个按钮设置不同的点击事件的具体内容
    void startButton_actionPerformed(ActionEvent e) {
        if (thread != null)
            isContinue=false;
        thread = new MyThread();
        thread.start();
    }

    void stopButton_actionPerformed(ActionEvent e) {
        if (thread != null)
            isContinue=false;
        thread = null;
    }


    //设置一个继承线程的类
    private class MyThread extends Thread{
        //写一个MyThread()构造方法
        public MyThread(){
            //给成员变量idContinue变量赋值
            isContinue=true;
        }
        public void run(){//重写run()方法
            System.out.println("\n\n");
            while (true&&isContinue){
                try {
                    Thread.sleep(600);//将该线程休眠600毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("以为过了炎热的夏就好，以为，爱就是一首一直循环的歌");
            }
        }
    }

    public static void main(String[] args){
        TestThread testThread = new TestThread();
        testThread.setBounds(500,300,300,100);
        testThread.setVisible(true);
    }

}
