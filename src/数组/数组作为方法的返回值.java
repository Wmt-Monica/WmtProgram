package 数组;

public class 数组作为方法的返回值 {
    public static void main(String[] args) {
        //定义一个数组对象来接收返回值；
        Double[] a=new Double[4];
        //调用计算机方法
        a=jisuanqi(4.0,6.0);
        //打印输出结果
        System.out.println("这两个数之和为"+a[0]);
        System.out.println("这两个数之差为"+a[1]);
        System.out.println("这两个数乘积为"+a[2]);
        System.out.println("这两个数相除为"+a[3]);
    }
    //定义一个简易计算器的方法
    public static Double[] jisuanqi(Double a,Double b){
        //使用动态初始化一个数组存放各种运算结果
        Double[] a1=new Double[4];
        a1[0]=a+b;
        a1[1]=a-b;
        a1[2]=a*b;
        a1[3]=a/b;
        return a1;
    }
}
