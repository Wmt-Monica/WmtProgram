package 反射;

public class Constructor_Test1 {
    public static void main(String[] args) {
        Example_01 example1 =new Example_01();
        Example_01 example2 = new Example_01("10","20","30");

        /*
            toString()方法
            在API中这么定义toString()等同于 getClass().getName()+'@'+Integer.toHexString(example1.hashCode())
            hashCode()方法返回该对象的哈希码值   这一般是通过将该对象的内部地址转换成一个整数来实现的
         */
        System.out.println(example1.getClass().getName()+'@'+Integer.toHexString(example1.hashCode()));
        System.out.println(example1.toString());

        /*
            newInstance()方法是创建一个无参数的构造方法对象
         */
        //读取配置文件

    }
}
