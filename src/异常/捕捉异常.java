package 异常;

public class 捕捉异常 {
    public static void main(String[] args) {
        try{
              int a=1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("==================================\n");
        try{
            Object b=null;
            //这里调用hashCode()这个函数，由于b是一个空指针，这里属于空指针异常
            b.hashCode();
        }catch (NullPointerException e){
            System.out.println("发生了空指针异常");
        } catch (ArithmeticException e) {
            //  e.printStackTrace(); //打印异常
            System.out.println("发生了算数异常");
        }catch (ClassCastException e){
            System.out.println("发生了类转换异常");
        }
        System.out.println("==================================\n");
        //异常中断
        try{
            System.out.println("1");
            System.out.println("2");
            int a=1/0; //在这里捕获到了异常 这里会发生异常中断 下面的语句不会执行
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("4");
            System.out.println("5");
        }
        System.out.println("==================================\n");
        //当循环再捕捉异常里面也会直接中断异常
        try {
            for(int i=0;i<10;i++){
                System.out.println(i);
                int a=1/i;
            }
        } catch (Exception e) {
            System.out.println("出现了算数异常，由于for循环语句再内部，异常中断会将for循环停止");
        }
        System.out.println("==================================\n");
        //当循环再捕捉异常外面会中断当前一个循环不影响接下来的循环
        for(int i=0;i<10;i++){
            try {
                System.out.println(i);
                int a=1/i;
            } catch (Exception e) {
                System.out.println("当循环再捕捉异常外面会中断当前一个循环不影响接下来的循环");
            }
        }
        System.out.println("==================================\n");
        try {
            System.out.println("打开连接池");
            System.out.println("连接池连接数据");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭连接池");
        }
        System.out.println("==================================\n");
        try {
            System.out.println("打开连接池");
            int a=1/0;//此处又算数异常 try后面的语句会中断
            System.out.println("连接池连接数据");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {//无论try语句如何运行，finally语句都会执行
            System.out.println("关闭连接池");
        }
        System.out.println("==================================\n");
        //四种特殊情况会使得finally将不会执行
        /*
            1.finally块中发生异常
            2.在前面的代码中使用了终止语句 System.exit()
            3.程序所在线死亡
            4.关闭CPU  (相当于电脑断电)
         */
        try{

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
           // int a=1/0;
            System.out.println("finally语句前面发生了算数异常，该语句不执行");
        }
       try {
           System.out.println("在finally语句前面使用System.exit()语句，程序提前终止，finally语句就不会执行");
          // System.exit(0);
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
           System.out.println("执行finally语句");
       }
        System.out.println("==================================\n");
       try{
//           System.out.println("请输入一个数字");
//           Scanner a=new Scanner(System.in);
//           int b=a.nextInt();
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
           System.out.println("这种情况属于线程死亡，前面必须完成输入一个数字，才能执行finally语句块");
       }
    }
}
