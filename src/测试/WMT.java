package 测试;

import javax.swing.*;
import java.awt.*;

public class WMT extends JFrame {
    public WMT() throws InterruptedException {
            setTitle("小朋友你是不是有很多问号？");
            Container container=getContentPane();
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<=35;i++){
            WMT wmt=new WMT();
            wmt.setVisible(true);
            for(int j=0;j<35;j++){
                wmt.setBounds(i*20,i*20,350,150);
            }
            if(i==34){
                for(int q=0;q<=35;q++){
                    WMT wmt1=new WMT();
                    wmt1.setVisible(true);
                    for(int j=0;j<35;j++){
                        wmt1.setBounds(1500-q*20,0+q*20,350,150);
                    }
                    if(q==35){
                        for(int p=0;p<10;p++){
                            for(int j=0;j<35;j++){
                                WMT wmt2=new WMT();
                                wmt2.setVisible(true);
                                wmt2.setBounds(p*150,0+j*20,350,150);
                            }
                        }
                    }
                }
            }
        }
    }
}
