package 测试;

import javax.swing.*;
import java.awt.*;

public class Three extends JFrame {
    public Three (String title){
        GridBagLayout layout=new GridBagLayout();
        GridBagConstraints c=new GridBagConstraints();
        this.setLayout(layout);
        c.fill=GridBagConstraints.BOTH;
        c.weightx=1;
        c.weighty=1;
        this.addComponent("but1",layout,c);
        this.addComponent("but2",layout,c);
        this.addComponent("but3",layout,c);
        c.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("btn4",layout,c);
        c.weightx=0;
        c.weighty=0;
        addComponent("btn5",layout,c);
        c.gridwidth=1;
        this.addComponent("but6",layout,c);
        c.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("but7",layout,c);
        c.gridheight=2;
        c.gridwidth=1;
        c.weightx=2;
        c.weighty=2;
        this.addComponent("but8",layout,c);
        c.gridwidth=GridBagConstraints.REMAINDER;
        c.gridheight=1;
        this.addComponent("but9",layout,c);
        this.addComponent("but10",layout,c);
        this.pack();
        this.setVisible(true);
    }
    private void addComponent(String name,GridBagLayout layout,GridBagConstraints c){
        Button bt=new Button(name);
        layout.setConstraints(bt,c);
        this.add(bt);
    }
}
class A
{
    public static void main(String[]args){
        new Three("GridBagLayout");
    }
}