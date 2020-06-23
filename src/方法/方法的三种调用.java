package 方法;

public class 方法的三种调用 {
    public static void main(String[] args) {
        //单独调用
        jia(2,2);
        System.out.println("====================");

        //打印使用
        System.out.println(jia(2,2));
        System.out.println("====================");

        //赋值使用
        int sum=jia(2,2);
        System.out.println("这两个数之和为"+sum);

    }

    public static int jia(int a,int b){
        System.out.println("方法执行了");
        int sum =a+b;
        return sum;
    }
}
