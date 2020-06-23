package 包装类;

public class Integer {
    public static void main(String[] args) {
        //获取Integer类的常量值
        //注意如果使用int型变量来输出会有数据溢出，导致结果不正确
        int size= java.lang.Integer.SIZE;
        System.out.println("int型可取的最大范围"+java.lang.Integer.MAX_VALUE);//2^31-1
        System.out.println("int型可取的最小范围"+java.lang.Integer.MIN_VALUE);//-2^31
        System.out.println("int型的二进制位数"+size);//4位，32字节
        System.out.println("int型的类型是"+java.lang.Integer.TYPE);//int
        System.out.println("=====================================");

        java.lang.Integer num1=new java.lang.Integer(44244);
        System.out.println(num1);
        java.lang.Integer num2=new java.lang.Integer("22422");
        System.out.println(num2);
        java.lang.Integer num3= java.lang.Integer.valueOf("4326471");
        System.out.println(num3);
        System.out.println("=====================================");

        int num4= java.lang.Integer.parseInt("876");
        System.out.println(num4-2);
        int num5=num2.intValue();
        System.out.println(num5-10);
        System.out.println("=====================================");

        //获取数字的十进制
        String str1= java.lang.Integer.toString(456);
        //获取数字二进制的表示
        String str2= java.lang.Integer.toBinaryString(456);
        //获取数字十六进制的表示
        String str3= java.lang.Integer.toHexString(456);
        //获取数字八进制的表示
        String str4= java.lang.Integer.toOctalString(456);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
