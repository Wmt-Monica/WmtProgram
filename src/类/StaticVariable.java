package 类;

public class StaticVariable {
    public static int x;  //x变量是static静态的是公共的可以在两个不同的对象进行改变
    public int y;
    public void StaticVariable(int x,int y){
        this.x=x;
        this.y=y;
    }
}
