package Swing;

import javax.swing.*;
import java.awt.*;

public class setLayout extends JFrame {
    public setLayout(){
        setTitle("本窗体使用绝对布局");//设置窗体的标题
        setLayout(null);  //取消窗体的布局管理器
        setBounds(500,300,300,300);//绝对定位窗体的位置和设定窗体的大小
        Container container=getContentPane();//创建窗体容器
        JButton one=new JButton("按钮1");
        JButton two=new JButton("按钮2");
        Font f=new Font("楷体",Font.BOLD,22);//设置按钮文字的样式
        one.setFont(f);
        two.setFont(f);
        one.setBounds(100,100,100,100);//使用setBound来实现按钮的绝对布局
        two.setBounds(0,0,150,80);//使用setBound来实现按钮的绝对布局
        container.add(one);//添加按钮到容器当中去
        container.add(two);//添加按钮到容器当中去
        setVisible(true);//设置窗体可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭的方式
    }
    public static void main(String[] args) {
        new setLayout(); //调用构造函数
    }
}
