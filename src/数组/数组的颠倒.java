package 数组;

public class 数组的颠倒 {
    public static void main(String[] args) {
        //使用静态初始化创建一个数组
        int[] a=new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<(a.length/2);i++){
            //利用颠倒关系进行再一次赋值
            int stemp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=stemp;
        }
        //遍历数组进行打印数组内容
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
