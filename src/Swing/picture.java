package Swing;

import javax.swing.*;
import java.awt.*;

public class picture extends JFrame {
    public picture(){
        setBounds(400,200,200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container=getContentPane();

//        JLabel a=new JLabel("这是一个展示图片的标签");  //用标签展示图片
//        URL uri=Swing.picture.class.getResource("Swing/1.jpg");
//        Icon icon=new ImageIcon(uri);
//        a.setIcon(icon);
//        container.add(a);

        setVisible(true);
    }

    public static void main(String[] args) {
        new picture();
    }
}
