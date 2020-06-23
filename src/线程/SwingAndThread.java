package 线程;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    /*
    首先创建一个窗口
     */

    /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
    private static final long serialVersionUID =1L;
    private JLabel jLabel=new JLabel();//声明JLabel对象
    private static Thread thread;//声明线程对象
    private int count=0;//声明计数变量
    private Container container= getContentPane();//声明容量

    //设定窗体
    public SwingAndThread(){
        setBounds(500,300,250,100);//设置窗体的大小和位置
        container.setLayout(null);//使窗体不使用任何布局管理器
        URL uri = SwingAndThread.class.getResource("1.gif");//获得图片的URL
        Icon icon =new ImageIcon(uri);//实例化一个Icon
        jLabel.setIcon(icon);//将图片放置在标签里面
        //设置图片在标签的最左方 （SwingConstants.LEFT 属性）
        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel.setBounds(10,10,200,50);
        jLabel.setOpaque(true);//设置可视
        //由于Java支持单继承，所以在继承了JFrame后要实现线程的run()方法只能通过Runnable()接口
        //使用线程的对象用来定义匿名内部类  该类实现Runnable接口
        thread =new Thread(new Runnable() {
            @Override
            public void run() { //重写run()方法
                while (count<=200){//设置循环条件
                    //将标签的横坐标用变量表示
                    jLabel.setBounds(count,10,210,50);
                    try {
                        Thread.sleep(100);//设置线程休眠的时间为1000毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count+=4;//使横坐标每次增加4
                    if(count>=200){
                        //设置当图标达标签的最右边，使其回到标签最左边
                        count=10;
                    }
                }
            }
        });
         //使用start()启动线程
        thread.start();
        container.add(jLabel);//将标签添加到容器中
        setVisible(true);//是窗体可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭方式
    }

    public static void main(String[] args) {
        new SwingAndThread();//实例化一个SwingAndThread对象
    }
}
