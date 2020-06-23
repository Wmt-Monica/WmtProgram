package 线程;

public class ThreadSafeTest implements Runnable {
    int num=10;//设置当前总票数
    @Override
    public void run() {
        while (true){
            if (num > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("票数："+num--);
            }
        }
    }

    public static void setPriority(String threadName,Thread thread){
        thread.setName(threadName);//设置线程的名称
        System.out.println(threadName);
        thread.start();//启动线程
    }

    public static void main(String[] args) {
        //实例化ThreadSafeTest()对象
        ThreadSafeTest test=new ThreadSafeTest();
        //创建四个线程对象
        Thread thread1=new Thread(test);
        Thread thread2=new Thread(test);
        Thread thread3=new Thread(test);
        Thread thread4=new Thread(test);

        //分别启动四个线程对同时存取单一对象的数据，产生的问题,票数出现了负数
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();//这是资源共享产生的冲突问题
    }
}
