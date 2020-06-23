package 异常;

public class throws抛出异常 {
    static void pop() throws NegativeArraySizeException{
        //定义方法并抛出NegativeArraySizeException异常
        int arr[]=new int[-3];  //创建一个数组
    }
    public static void main(String[] args) {
     try{
         pop();//调用pop()方法
     } catch (NegativeArraySizeException e) {
         e.printStackTrace();
         System.out.println("pop()方法抛出异常");
     }
    }
}
