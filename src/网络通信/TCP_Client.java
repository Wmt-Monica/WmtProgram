package 网络通信;

import java.io.*;
import java.net.*;

public class TCP_Client {
    public static void main(String[] args) throws IOException {
        //创建客户端套字节对象client,其中第一个参数是服务端的IP地址，第二个参数是服务器向客户端所打开的接口
        Socket client = new Socket("127.0.0.1",1100);
        System.out.println("与服务器连接成功");

        //为了向服务器传输数据，创建 OutputStream 对象 (输出流对象)
        OutputStream outputStream = client.getOutputStream();
        String message = "服务器你好，我是客户端"; //设置一段需要传输的语句
        //将输出流对象 message 写入，采用getBytes()方法将message字符串转换成字节
        outputStream.write(message.getBytes());

        //采用输入流对象用来服务器接收服务端的消息
        InputStream inputStream = client.getInputStream();
        byte[] bytes =new byte[1024];//创建一个字节数组的容器
        int len = inputStream.read(bytes);//将字节的获取的信息的字节长度存入int数据类型len中去
        String data = new String(bytes,0,len);//将输入流对象获取到的字节数据转换成字符串
        System.out.println("服务端传来的信息是："+data);//将转换好的字符串信息打印出来

        client.close();//关闭套字节
    }
}
