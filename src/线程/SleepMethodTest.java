package 线程;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
    //首先要构建好一个实例化窗口
     /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
     private static final long serialVersionUID=1L;
     private Thread thread; //声明线程对象
    //定义颜色数组  装容颜色的Color类
    private static Color[] colors={
            Color.BLACK,Color.WHITE,Color.CYAN,Color.GRAY,
            Color.ORANGE,Color.RED,Color.PINK,Color.LIGHT_GRAY
    };
    private static final Random random =new Random();// 使用Random随机类，创建随机对象

    private static Color getColor(){  //获取随机对象
        return  colors[random.nextInt(colors.length)];
    }

    //创建构造方法SleepMethodTest()
    public SleepMethodTest(){
        //使用线程对象thread 创建匿名线程对象
        thread = new Thread(new Runnable() {
            int x= 30;  //定义初始化坐标
            int y= 50;
            @Override
            public void run() { //覆盖线程接口方法
                while (true){  //设置循环，进入死循环
                    try {
                        Thread.sleep(100); //设置线程休眠100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取组件绘图上下文对象  绘图的类 Graphics 使用这个类需要继承JFrame
                    Graphics graphics=getGraphics();
                    //使用setColor函数来绘制图形颜色  getColor()方法是返回随机的颜色
                    graphics.setColor(getColor());
                    //绘制直线并递增垂直喝水平坐标
                    graphics.drawLine(x,y,300,y++);
                    if(y>=100){
                        y=50;
                    }
                }
            }
        });
        thread.start();//启动线程
    }

    //初始化程序的实例化界面
    public static void Wmt(JFrame jFrame,int x,int y,int width,int height){
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭方式
        jFrame.setBounds(x,y,width,height);//设置窗体的位置和大小
        jFrame.setVisible(true);//设置窗体可见
    }

    public static void main(String[] args) {
        Wmt(new SleepMethodTest(),500,300,330,130);
    }
}
