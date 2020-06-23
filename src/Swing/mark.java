package Swing;

import javax.swing.*;
import java.awt.*;

public class mark extends JFrame {
    public mark(){
        setBounds(200,200,200,200);  //设置位置和大小
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //设置关闭即停止程序
        Container container=getContentPane();  //获得窗体容器
        setVisible(true);  //设置窗体可见

        JLabel a=new JLabel("这是一个标签");
        container.add(a);  //添加标签
        System.out.println("输出的标签内容是："+a.getText());

        a.setFont(new Font("汉仪瘦金书简",Font.BOLD,20));  //更改标签的字体 效果，和大小
        a.setForeground(Color.pink);  //更改前景色，字体的颜色
    }

    public static void main(String[] args) {
        new mark();
    }
}
