package 线程;

public class ThreadSafeTest2 implements Runnable {
    //设置票数
    int num=10;

    @Override
    public void run() {//重写run()方法
        while (true){
            /*Java中提供了同步机制，可以有效地防止资源冲突。
              在该类中修改使用synchronized关键字
             */
            synchronized (""){
                if(num>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickets"+--num);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest2 thread =new ThreadSafeTest2();
        Thread thread1 =new Thread(thread);
        Thread thread2 =new Thread(thread);
        Thread thread3 =new Thread(thread);
        Thread thread4 =new Thread(thread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
