package Swing;

import javax.swing.*;
import java.awt.*;

public class JListTest extends JFrame {
    /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
    private static final long serialVersionUID = 1L;

    public JListTest(){
        setTitle("这是一个列表框组件测试窗体");
        Container container=getContentPane();
        setBounds(500,100,300,300);
        //不设置任何布局
        container.setLayout(null);
        //采用JDK7中的新特性
        JList<String> jList=new JList<>(new MyListModel());
        //设置一个滚动画板 jScrollPane 并且将列表组件放进去
        JScrollPane jScrollPane=new JScrollPane(jList);
        //设置滚动画板在容器中的位置和大小，注意：不设置大小的话，将不显示画板内容
        jScrollPane.setBounds(50,50,80,100);
        //将滚动画板添加到容器当中去
        container.add(jScrollPane);
        //设置窗体可见
        setVisible(true);
        //设置窗体关闭类型
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    class MyListModel extends AbstractListModel<String>{

        /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
        private static final long serialVersionUID = 1L;
        private String[] list={ "列表1", "列表2", "列表3", "列表4", "列表5", "列表6" };
        @Override
        /*
            设置列表的规格大小
         */
        public int getSize() {
            return list.length;
        }

        @Override
        /*
            返回列表中的内容
         */
        public String getElementAt(int index) {
           if(index<list.length){
               return list[index++];
           }else{
               return null;
           }
        }
    }

    public static void main(String[] args) {
        new JListTest();
    }
}
