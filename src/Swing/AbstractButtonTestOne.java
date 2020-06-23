package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class AbstractButtonTestOne extends JFrame {
    public AbstractButtonTestOne(){
        /*
             添加图片的方法
             URL uri=AbstractButtonTest.class.getResource("1.png");
             Icon icon=new ImageIcon(uri);
         */
        URL uri= AbstractButtonTestOne.class.getResource("1.png");
        Icon icon=new ImageIcon(uri);
        setLayout(new GridLayout(4,3,10,10));
        Container container=getContentPane();
        for(int i=0;i<6;i++){
            container.add(new JButton("button"+(i+1)));
        }
        for(int i=0;i<3;i++){
            JButton jButton=new JButton();//另外设置一个按钮
            /*
                 setMaximumSize：将组件的最大大小设置为常量值。
             */
            jButton.setMaximumSize(new Dimension(90,30));//设置按钮的大小与图片的相同
            jButton.setIcon(icon);//为按钮设置图标
            /*
                设置 hideActionText 属性，该属性确定按钮是否显示 Action 的文本。
             */
            jButton.setHideActionText(true);
            jButton.setToolTipText("图片按钮");//设置按钮提示文字
            jButton.setBorderPainted(false);//为按钮边框不显示
            /*
                为按钮添加监听时间
             */
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    /*
                        JOptionPane 有助于方便地弹出要求用户提供值或向其发出通知的标准对话框
                        showMessageDialog 调出标题为 "Message" 的信息消息对话框。
                     */
                    JOptionPane.showMessageDialog(null,"弹出对话框");
                }
            });
            container.add(jButton);//添加按钮到容器里面
        }


        setBounds(500,300,400,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    //定义三个单选按钮
    JRadioButton jr1=new JRadioButton("one");
    JRadioButton jr2=new JRadioButton("two");
    JRadioButton jr3=new JRadioButton("three");
    //这是一个按钮组
    ButtonGroup group=new ButtonGroup();
    //将三个单选按钮一起放入一个按钮组当中去

    public ButtonGroup getGroup() {
        group.add(jr1);
        group.add(jr2);
        group.add(jr3);
        return group;
    }

    public static void main(String[] args) {
        new AbstractButtonTestOne();
        new ButtonGroup();
    }
}
