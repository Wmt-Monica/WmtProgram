package 网络通信.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {//创建类Server
    /*
        从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
     */
    private BufferedReader reader;//创建BufferedReader对象
    /*
       创建服务器的套接字
     */
    private ServerSocket serverSocket;//创建ServerSocket对象
    /*
        创建连接到指定主机和端口的客户机套接字。
     */
    private Socket socket;//创建Socket对象

    void getServer(){
        try {
            /*
                将服务器套字节占用端口为8998的位置
             */
            serverSocket = new ServerSocket(8998);//实例化serverSocket对象
            System.out.println("服务器套字节已经创建成功");//输出套接字创建成功的提示
            /*
                这里使用了try/catch语句。假如创建套接字发生多错误，就会直接被catch语句捕获，不能执行下面的语句
             */
            while (true){//如果套字节是连接状态
                System.out.println("等待客户端连接");//输出信息
                /*
                    accept()方法，用于等待客户机连接。若连接，则创建一个套接字
                 */
                socket=serverSocket.accept();//实例化Socket对象

        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
