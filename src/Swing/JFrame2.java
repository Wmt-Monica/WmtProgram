package Swing;

import javax.swing.*;
import java.awt.*;

public class JFrame2 extends JFrame {
    //创建一个构造方法
    public JFrame2(){
        setTitle("窗口标题");
        setVisible(true);  //设置窗体可见
        /**
         * 关闭窗口的四种常见类型
         * DO_NOTHING_ON_CLOSE (隐藏窗口，但是不停止操作)
         * DISPOSE_ON_CLOSE (无任何操作)
         * HIDE_ON_CLOSE (隐藏窗口，但是不停止程序)
         * EXIT_ON_CLOSE (隐藏窗口，并停止程序)
         */
        //设置窗体关闭的类型
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



//        //设置窗体的大小 单位：像素
//        jf.setSize(300,300);
//        //设置窗体的坐标 单位：像素
//        jf.setLocation(630,280);
//        //同时设置窗体的坐标和大小，单位：像素
        setBounds(630,280,300,300);



        //获取窗体容器
        Container container=getContentPane();
        //设置窗体背景颜色
        container.setBackground(Color.WHITE);
        JLabel jLabel=new JLabel("这是一个窗体组件");
        container.add(jLabel); //添加组件
//        container.remove(jLabel);//删除容器中的组件
        container.validate();//验证容器组件
//        jf.setContentPane(container);//重新载入容器  (不推荐使用)



        //设置窗体的大小是否可以改变 true or false
        setResizable(false);

        //获取窗体的坐标
        System.out.println("x="+getX()+"\ny="+getY());
    }

    public static void main(String[] args) {
        //常见构造方法的对象，对构造方法进行调用
        new JFrame2();
    }
}
