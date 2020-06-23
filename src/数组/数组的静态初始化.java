package 数组;

public class 数组的静态初始化 {
    public static void main(String[] args) {
        //数据类型[] 数组名称=new 数据类型[]{数据内容}
        //定义一个存放1,2,3,4,5,6,7,8,9,0的int型数组
        int[] a1=new int[]{1,2,3,4,5,6,7,8,9,0};
        //静态初始化省略格式
        int[] b1={1,2,3,4,5,6,7,8,9,0};

        //定义一个存放1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0的Double型数组
        Double[] a2=new Double[]{1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
        //静态初始化省略格式
        Double[] b2={1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};

        //定义一个存放你好，王梦婷，我是宝宝啊的字符型数组
        String[] a3=new String[]{"你好","王梦婷","我是宝宝啊"};
        //静态初始化省略格式
        String[] b3={"你好","王梦婷","我是宝宝啊"};

        //定义一个存放了false,false,true,false,true,true,true,true的boolean型数组
        boolean[] a4=new boolean[]{false,false,true,false,true,true,true,true};
        //静态初始化省略格式
        boolean[] b4={false,false,true,false,true,true,true,true};
    }
}
