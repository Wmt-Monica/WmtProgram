package 网络通信;

import java.net.*;

public class Address {//创建类

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip; //创建InetAddress对象
        ip =InetAddress.getLocalHost();//实例化对象  getLocalHost()方法事获取对象所包含的IP地址
        String localname = ip.getHostName(); //获取本机名
        String localip =ip.getHostAddress(); //获取本IP地址
        System.out.println("本机名"+localname); //将本机名输出
        System.out.println("本机的IP地址"+localip); //将本机IP 地址输出
    }
}
