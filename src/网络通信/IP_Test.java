package 网络通信;

import java.io.InputStream;
import java.net.*;

public class IP_Test {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress local = InetAddress.getByName("www.baidu.com");
//        System.out.println(local);
//        System.out.println("计算机名"+local.getHostName());//输出计算机名
//        System.out.println("IP地址："+local.getHostAddress());

        InetAddress baidu[] = InetAddress.getAllByName("www.dreamplume.com");
        for(InetAddress address: baidu){
            System.out.println("百度的IP地址："+address.getHostAddress());
        }

    }
}
