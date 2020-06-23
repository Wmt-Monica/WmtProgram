package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbstractButtonTestTwo extends JFrame {
    /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
    private static final long serialVersionUID = 1L;
    //设置两个私有化的面板
    private JPanel jPanel1=new JPanel();
    private JPanel jPanel2=new JPanel();
    private JPanel jPanel3=new JPanel();
    //设置一个而私有化的对话框
    private JTextArea jTextArea=new JTextArea(8,10);
    //设置三个单选按钮
    private JRadioButton jr1=new JRadioButton("A        ");
    private JRadioButton jr2=new JRadioButton("B        ");
    private JRadioButton jr3=new JRadioButton("C");
    //设置三个复选按钮
    private JCheckBox jc1=new JCheckBox("1      ");
    private JCheckBox jc2=new JCheckBox("2      ");
    private JCheckBox jc3=new JCheckBox("3");

    public AbstractButtonTestTwo(){
        //设置窗体容器
        Container container=getContentPane();

        //设置布局为边框布局
        container.setLayout(new BorderLayout());


        //JScrollPane 带滚动条的面板设置 这里将对话框设置为可以带滚动条
        final JScrollPane jScrollPane = new JScrollPane(jTextArea);
        //将带滚轮的对话框放置在第一个面板中去
        jPanel1.add(jScrollPane);
        //将第一个面板通过边框布局防止在顶端
        container.add(jPanel1,BorderLayout.NORTH);

        //将单选按钮放置在第二个面板中
        jPanel2.add(jr1);
        jPanel2.add(jr2);
        jPanel2.add(jr3);
        //将第二个面板通过边框布局放置在中间
        container.add(jPanel2,BorderLayout.CENTER);


        //将复选按钮放在第三个面板当中去
        jPanel3.add(jc1);
        jPanel3.add(jc2);
        jPanel3.add(jc3);
        //将第三个面板通过边框布局放置在容器底部
        container.add(jPanel3,BorderLayout.SOUTH);


        //为选择单选按钮和复选按钮添加监听事建
        jr1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jr1.isSelected())
                    jTextArea.append("单选按钮A被选中\n");
            }
        });

        jr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jr2.isSelected())
                    jTextArea.append("单选按钮B被选中\n");
            }
        });

        jr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jr3.isSelected())
                    jTextArea.append("复选按钮C被选中\n");
            }
        });

        jc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jc1.isSelected())
                    jTextArea.append("复选按钮1被选中\n");
            }
        });

        jc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jc2.isSelected())
                    jTextArea.append("复选按钮2被选中\n");
            }
        });

        jc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jc3.isSelected())
                    jTextArea.append("复选按钮3被选中\n");
            }
        });

        //设置窗口的位置和大小
        setBounds(500,300,200,250);
        //设置窗口可见
        setVisible(true);
        //设置窗口关闭类型
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new AbstractButtonTestTwo();
    }

}
