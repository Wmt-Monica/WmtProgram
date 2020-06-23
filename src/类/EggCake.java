package 类;

public class EggCake {
    int EggCakeCount;
    //无参构造方法
   /* public EggCake(){
        this.EggCakeCount=1;
        System.out.println("阿姨加了"+this.EggCakeCount+"个鸡蛋");
    }*/
    //有参构造方法
    public EggCake(int Count){
        this.EggCakeCount=Count;
        System.out.println("阿姨加了"+this.EggCakeCount+"个鸡蛋");
    }
    //利用this来调用有参数的构造函数
    public EggCake(){
        this(1);
    }
}
