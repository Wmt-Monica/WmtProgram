package Swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutOne extends JFrame {
     String[] border={
             BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.EAST,
             BorderLayout.WEST,BorderLayout.CENTER
     };//设置窗体的边界布局类型
     String[] butName={
             "north button","south button","east button","west button","center button"
     };//设置窗体的名字
    public BorderLayoutOne(){
        setTitle("这是一个使用边界布局的管理器测试窗体");
        Container container=getContentPane();
        setLayout(new BorderLayout());//设置容器为边界布局管理器
        for(int i=0;i<border.length;i++){

            //在容器中添加按钮
            container.add(border[i],new JButton(butName[i]));
        }
        setBounds(500,300,500,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderLayoutOne();
    }
}
