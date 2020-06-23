package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class ActionEventTest extends JFrame{

    /*
       private static final long serialVersionUID=1L意思是定义程序序列化ID。
       序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
       避免在程序版本升级时程序报告的错误。
    */
    private static final long serialVersionUID = 1L;
    private JButton jButton=new JButton("我是按钮，快点击我");
    private ActionEventTest(){
        setTitle("这是一个动作事件监听器");
        setBounds(500,200,200,80);
        Container container=getContentPane();
        jButton.setBounds(80,80,50,10);
        //这里使用内部类实现按钮动作监听功能
        jButton.addActionListener(new jButtonAction());
        container.add(jButton);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    class jButtonAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            jButton.setText("我被单击了");
        }
    }

    public static void main(String[] args) {
        new ActionEventTest();
    }
}
