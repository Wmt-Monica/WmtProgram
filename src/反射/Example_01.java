package 反射;

public class Example_01 {
    String s;
    int i,i2,i3;

    public Example_01() {
    }
    //String...strings 表示有多个参数
    public Example_01(String...strings){
        //给成员变量赋值，确保每一个参数都有对应的成员变量
        if(0<strings.length){
            i=Integer.valueOf(strings[0]);
        }
        if(1<strings.length){
            i2=Integer.valueOf(strings[1]);
        }
        if(2<strings.length){
            i3=Integer.valueOf(strings[2]);
        }
    }
    //print()方法：打印成员变量对应的值
    public void print(){
        System.out.println("s="+s);
        System.out.println("i="+i);
        System.out.println("i2="+i2);
        System.out.println("i3="+i3);
    }

}
