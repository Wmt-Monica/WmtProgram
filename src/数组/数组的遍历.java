package 数组;

public class 数组的遍历 {
    public static void main(String[] args) {
        //使用静态初始化创建一个int型数组
        int[] a=new int[]{1,3,5,6,8,54,3,674,325,63,526,74,235,3,2,24,25,63,6,};
        //利用 .length获取数组的长度
        for(int i=0;i<a.length;i++){
            //打印出数组中的每一个数据
            System.out.println(a[i]);
        }
    }
}
