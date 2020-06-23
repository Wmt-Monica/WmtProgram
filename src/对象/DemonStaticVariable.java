package 对象;

import 类.StaticVariable;

public class DemonStaticVariable {
    public static void main(String[] args) {
        StaticVariable variable=new StaticVariable();
        StaticVariable variable2=new StaticVariable();
        variable.StaticVariable(2,4);
        variable2.StaticVariable(22,44);
        System.out.println("variable.x="+variable.x+" variable.y="+variable.y);
        System.out.println("variable.x="+variable2.x+" variable.y="+variable2.y);
    }
}
