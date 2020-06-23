package 方法;

public class 方法的重载 {
    public static void main(String[] args) {
        //我们在调用的时候由于第一个，第三个，第四个数据类型的不同所以在调用时输入的参数要突出数据类型
        System.out.println(add(3,4));
        System.out.println(add(3,4,5));
        System.out.println(add(3.0,4));
        System.out.println(add(3,4.0));
        System.out.println(add(3,4,5,6,7,54,354,3));
    }
    //方法的重载只有三种，然后与其他的无关否则报错（方法名字相同）
    static int add(int a,int b){
        System.out.println("--------------------------");
        return a+b;
    }
    static double add(int a,int b,int c){  //参数的个数不同
        System.out.println("==========================");
        return a+b+c;
    }
    static double add(int a,double b){ //参数的类型不同
        System.out.println("**************************");
        return a+b;
    }
    static double add(double a,int b){ //不同类型的参数类型的顺序不同
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return a+b;
    }
    //定义不定参数个数的方法，次数(int...a)相当于(int[]a)数组的形式
    static double add(int...a){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
