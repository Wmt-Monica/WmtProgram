package 异常;

import javax.swing.*;

public class NonePeople extends Exception{
    String Type;
    public NonePeople(String Type){
        super(Type);
        this.Type=Type;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        JOptionPane.showMessageDialog(null,Type,"发生异常",JOptionPane.ERROR_MESSAGE);
    }
}
