package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JDialog1 extends JDialog { //继承窗体这个类
    public JDialog1(JFrame jFrame){   //里面的参数是选择父类的窗体

        /**
         * 第一个参数，父类窗体对象
         * 第二个参数，对话框标题
         * 第三个参数，是否堵塞父窗体
         */
        super(jFrame,"这是子类窗体",true);

        //获得窗体的容器
        Container container1=getContentPane();
        //添加窗体的标签组件
        container1.add(new Button("2"));

        setBounds(200,200,100,100); //设置窗体的位置和大小

    }




    public static void main(String[] args) {
        JFrame jFrame=new JFrame("父窗体");  //设置一个父类窗体
        jFrame.setBounds(100,100,300,300);  //设置父类窗体的位置和大小
        jFrame.setLayout(null);
        Container container=jFrame.getContentPane();  //获取父类窗体的容器
        JButton button1=new JButton("上一个");  //按钮
        button1.setBounds(30,50,80,30);
        JButton button2=new JButton("下一个");  //按钮
        button2.setBounds(130,50,80,30);
        container.add(button1); //添加按钮标签
        container.add(button2); //添加按钮标签
        jFrame.setVisible(true);  //设置窗体可见
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);  //设置窗体关闭的类型

        button1.addActionListener(new AbstractAction() {  //设置按钮被点击之后的效果
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog1 jDialog1=new JDialog1(jFrame);   //创造构造方法中的子窗体
                jDialog1.setVisible(true);
            }
        });

        button2.addActionListener(new AbstractAction() {  //设置按钮被点击之后的效果
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JListTest jListTest= new JListTest();   //创造构造方法中的子窗体
                jListTest.setVisible(true);
            }
        });
    }
}
