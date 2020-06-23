package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class JComboBoxTest extends JFrame {
    /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
    private static final long serialVersionUID = 1L;
    JComboBox<String> jComboBox=new JComboBox<>(new MyComboBox());
    JLabel jLabel=new JLabel("请选择证件");
    public JComboBoxTest(){
        //Dimension可以设置窗体的大小，但是本人还是比较喜欢用 setBounds 即可以设置位置又可以设置宽高
       // setSize(new Dimension(160, 180));
        setBounds(500,300,200,200);
        setTitle("这是一个下拉列表测试窗体");
        Container container=getContentPane();
        //设定窗体的布局为浮动布局
        container.setLayout(new FlowLayout());
        container.add(jLabel);
        container.add(jComboBox);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JComboBoxTest();
    }

    class MyComboBox extends AbstractListModel<String>implements ComboBoxModel<String>{

        private static final long serialVersionUID = 1L;
        String select= null;
        String[] test = { "身份证", "军人证", "学生证", "工作证" };

        @Override
        public void setSelectedItem(Object anItem) {
            select = (String) anItem;
        }

        @Override
        /*
            获取下列表中的项目内容
         */
        public Object getSelectedItem() {
            return select;
        }

        @Override
        /*
            返回下拉列表框中的项目的数目
         */
        public int getSize() {
            return test.length;
        }

        @Override
        /*
            根据索引返回值
         */
        public String getElementAt(int index) {
            return test[index];
        }

    }

}
