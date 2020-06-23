package 继承;

public class Computer {
    //将属性改为公共静态才能在子类中使用
    public String name;
    //构造方法
     Computer(String name){
        this.name=name;
    }
    void Open(){
        System.out.println("正在开机，请稍后......");
    }
    void ShowPicture(){
         System.out.println("鼠标点击，显示图片");
    }
}
