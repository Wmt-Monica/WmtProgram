package Swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {
    public FlowLayout(){
        setTitle("使用流布局管理器的窗口测试");
        setBounds(280,250,900,300);
        Container container=getContentPane();
        setLayout(new java.awt.FlowLayout(1,10,10));
        for(int i=0;i<10;i++){
            container.add(new JButton("button"+(i+1)));
        }
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FlowLayout();
    }
}
