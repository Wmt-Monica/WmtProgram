package 网络通信;

import java.io.*;
import java.net.*;

public class MyTcp { //创建类MyTcp
    private BufferedReader reader;//创建BufferedReader对象  (读取字节流对象)
    private ServerSocket serverSocket;//创建ServerSocket 对象 (服务器套字节)
    private Socket socket; //创建Socket对象socket (套字节)

    void getserver() throws IOException {
        serverSocket =new ServerSocket(8998);//实例化Socket对象
        System.out.println("服务器套字节已经创建成功");//输出信息
        while (true){ //如果套字节事连接状态
            System.out.println("等待客户机的连接");//输出信息
            socket =serverSocket.accept();//实例化Socket对象
            reader =new BufferedReader(new InputStreamReader
                    (socket.getInputStream()));//实例化BufferedReader  (读取字节流)对象

        }
    }

    private  void grtClientMessage() throws IOException {
        try {
            while (true){//如果套字节是否为连接状态
                if(reader.ready()){ //reader中的  ready  方法是用来判断是否做好了被读取的准备
                    //获取客户信息
                    System.out.println("客户机"+reader.readLine());//readLine()方法是用来获取客户端的信息
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(reader!=null){
                reader.close();//关闭流
            }
            if(socket!=null){
                socket.close();//关闭字节套
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {//主方法
        MyTcp tcp=new MyTcp();//创建本类对象
        tcp.getserver();//调用方法
    }
}
