package 数组;

public class 数组作为方法参数 {
    public static void main(String[] args) {
        //创建一下这些数组
        int[] a1=new int[]{1,2,3,4,5,6,7,8,9,0};
        int[] b1={1,2,3,4,5,6,7,8,9,0};
        Double[] a2=new Double[]{1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
        Double[] b2={1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
        String[] a3=new String[]{"你好","王梦婷","我是宝宝啊"};
        String[] b3={"你好","王梦婷","我是宝宝啊"};
        boolean[] a4=new boolean[]{false,false,true,false,true,true,true,true};
        boolean[] b4={false,false,true,false,true,true,true,true};
        //调用打印数组的方法
        dayin(a1);
        dayin(b1);
        dayin(a2);
        dayin(b2);
        dayin(a3);
        dayin(b3);
        dayin(a4);
        dayin(b4);
    }
    //创建一个打印数组的方法
    public static void dayin(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
    public static void dayin(Double[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
    public static void dayin(String[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
    public static void dayin(boolean[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
