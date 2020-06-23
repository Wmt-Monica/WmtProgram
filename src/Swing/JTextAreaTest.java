package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTextAreaTest extends JFrame {

    /*
       private static final long serialVersionUID=1L意思是定义程序序列化ID。
       序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
       避免在程序版本升级时程序报告的错误。
    */
    private static final long serialVersionUID = 1L;

   private JTextAreaTest(){
        setTitle("这是一个可以自动换行的文本框组件测试窗体");
        setBounds(500,300,200,200);
        Container container=getContentPane();
        JTextArea jTextArea=new JTextArea("这里是可自动换行的文本组件默认内容哦",10,10);
        //设定可以自动换行
        jTextArea.setLineWrap(true);
        container.add(jTextArea);
        //添加监听事件，可以达到点击文本域就可以清除原本的默认内容
        jTextArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1){
                    jTextArea.setText("");
                }
            }
        });
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextAreaTest();
    }
}
