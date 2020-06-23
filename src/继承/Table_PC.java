package 继承;

public class Table_PC extends Computer {
    //将属性改为静态才能使用
    static String name="平板电脑";  //与父类有相同的属性所以进行覆盖
    static String battery="50000x";

    Table_PC(String name) {
        //super本身就是对name的初始化，在其之前不能对name初始化
        super(name);
        //但是可以在后面对name进行初始化
        name="苹果电脑";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println("=================");
    }
    void Open3G(){
        System.out.println("打开3G网络");
    }
    void ShowPicture(){
        System.out.print("平板电脑不用");
        System.out.println("手指点击，显示图片");
        //super.方法和super.属性，都是第哦啊用父类原有的，即使子类覆盖了的部分
        super.ShowPicture();
        System.out.println(super.name);
    }
}
