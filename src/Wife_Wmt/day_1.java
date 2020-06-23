package Wife_Wmt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class day_1 extends JFrame {
    JButton jButton1=new JButton("重启");
    JButton jButton2=new JButton("关机");
    JButton jButton3=new JButton("断网");
    JButton jButton4=new JButton("检查");
    public day_1(){
        setTitle("关机重启");
        setBounds(650,250,300,300);
        Container container=getContentPane();
        setLayout(null);
        jButton1.setBounds(20,50,100,30);
        jButton2.setBounds(170,50,100,30);
        jButton3.setBounds(20,150,100,30);
        jButton4.setBounds(170,150,100,30);
        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4);
        jButton1.addActionListener(new JButtonAction1());
        jButton2.addActionListener(new JButtonAction2());
        jButton3.addActionListener(new JButtonAction3());
        jButton4.addActionListener(new JButtonAction4());
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class JButtonAction1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //1.需要运行命令行
            Runtime runtime=Runtime.getRuntime();
            //2.执行命令
            try {
                Process process=runtime.exec("shutdown -r");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    class JButtonAction2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //1.需要运行命令行
            Runtime runtime=Runtime.getRuntime();
            //2.执行命令
            try {
                Process process=runtime.exec("shutdown -s");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    class JButtonAction3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //1.需要运行命令行
            Runtime runtime=Runtime.getRuntime();
            //2.执行命令
            try {
                Process process=runtime.exec("netsh wlan disconnect");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    class JButtonAction4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //1.需要运行命令行
            Runtime runtime=Runtime.getRuntime();
            //2.执行命令
            try {
                Process process=runtime.exec("netsh wlan show profiles");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new day_1();
    }
}
