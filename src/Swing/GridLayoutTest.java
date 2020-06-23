package Swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
    public GridLayoutTest(){
        setTitle("这是一个网格布局管理器窗体测试");
        Container container=getContentPane();
        setBounds(350,200,500,300);
        //设置容器使用网格布局管理器，设置10行4列，网格水平距离为4，垂直距离为5
        setLayout(new java.awt.GridLayout(10,4,4,5));
        for(int i=0;i<40;i++){
            container.add(new JButton("button"+(i+1)));
        }
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
