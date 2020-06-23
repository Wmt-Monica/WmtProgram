package 网络通信;

import java.io.*;
import java.net.*;

public class TCP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1100);//创建一个服务器套字节  (端口选择1100)
        System.out.println("服务器启动成功，等待用户接入......");//打印出服务器启动成功等待用用户接入的提示
        /*使用服务器套字节对象 serverSocket对象 采取等待客户机接入的方法 accept() 返回值是一个 Socket 值
         *创造一个Socket对象 client ,它其实是一个客户端的Socket对象
         * 服务器可以通过 Socket 对象与客户端交流
         */
        Socket client = serverSocket.accept();
        //使用 Socket 客户端对象 client 与客户端传输数据  使用getInetAddress方法返回客户端IP地址
        System.out.println("有客户端的接入，客户端的IP地址为："+client.getInetAddress());

        //采用输入流对象用来服务器接收客户端的消息
        InputStream inputStream = client.getInputStream();
        byte[] bytes =new byte[1024];//创建一个字节数组的容器
        int len = inputStream.read(bytes);//将字节的获取的信息的字节长度存入int数据类型len中去
        String data = new String(bytes,0,len);//将输入流对象获取到的字节数据转换成字符串
        System.out.println("客户端传来的信息是："+data);//将转换好的字符串信息打印出来

        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }
        };
        String message = "服务器你好，我是客户端"; //设置一段需要传输的语句
        //将输出流对象 message 写入，采用getBytes()方法将message字符串转换成字节
        outputStream.write(message.getBytes());

        client.close();//关闭字节套
    }
}
