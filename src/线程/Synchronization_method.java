package 线程;

public class Synchronization_method extends Thread{
    int index=0;
    String[] strings={"Hello","Java","Study","WMT","WL"};
    public void run(){
        while (true){
            /*
                数组的循环调用的时候后面使用%number,则是一直循环数组内部number个内容
             */
            System.out.println(strings[index++%3]);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Synchronization_method().start();
    }
}
