package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class JTextFieldTest extends JFrame {

    /*
       private static final long serialVersionUID=1L意思是定义程序序列化ID。
       序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
       避免在程序版本升级时程序报告的错误。
    */
    private static final long serialVersionUID = 1L;

    private JTextFieldTest(){
        //设置窗体的标题
        setTitle("这是一个文本框组件的测试窗体");
        //设置窗体的位置和大小
        setBounds(500,300,270,100);
        //设置窗体容器
        Container container=getContentPane();
        //设置窗体中的布局为浮动布局
        setLayout(new FlowLayout());
        //设置文本框组件
        JTextField jTextField=new JTextField("这里是默认输入的内容",25);
        //设置按钮组件
        JButton jButton=new JButton("清除");
        //添加文本域组件和按钮
        container.add(jTextField);
        container.add(jButton);
        //为文本域组件添加监听事件

        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if (e.getButton() == MouseEvent.BUTTON1){
                    jTextField.setText("");
                }
            }
        });

        //为按钮添加监听事件,只要鼠标点击文本域组件就可以清除默认内容
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //点击这个清除按钮设置文本域内容清除
                jTextField.setText("");
                //清除了文本域的内容后，其焦点也回到文本域
                jTextField.requestFocus();
            }
        });
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
