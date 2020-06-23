package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventTest extends JFrame {
    private FocusEventTest(){
        setTitle("这是一个焦点事件监听器的测试窗体");
        setBounds(500,200,100,100);
        Container container=getContentPane();
        setLayout(new FlowLayout());
        JTextField jt1=new JTextField("清单击其他的的文本款",10);
        JTextField jt2=new JTextField("清单击我",10);
        container.add(jt1);
        container.add(jt2);
        //为组件 jt1 添加食去焦点的监听事件
        jt1.addFocusListener(new FocusListener() {
            @Override
            /*
                组件获取焦点时调用的监听方法
             */
            public void focusGained(FocusEvent e) {

            }

            @Override
            /*
                组件失去焦点时的调用的方法
             */
            public void focusLost(FocusEvent e) {
                JOptionPane.showMessageDialog(null,"文本框失去焦点");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FocusEventTest();
    }
}
