package Swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
    public JScrollPaneTest(){
        setTitle("这是一个JScrollPane面板(带滚轮)测试窗体");
        Container container=getContentPane();
        setBounds(400,200,200,200);
        JTextArea text=new JTextArea(20,50);//创建一个文本区域的组件
        JScrollPane jScrollPane=new JScrollPane(text);//创建一个JScrollPane面板对象
        container.add(jScrollPane);//添加组件
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
