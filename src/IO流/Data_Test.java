package IO流;

import java.io.*;

public class Data_Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream content1=new FileOutputStream("src/word2.txt");//设置FileOutputStream对象
        DataOutputStream content2=new DataOutputStream(content1);//设置DataOutputStream对象

        //将语句写入磁盘文件当中去
        content2.writeUTF("使用writeUTF()方法写入数据");
        content2.writeChars("使用writeChars()方法写入数据");
        content2.writeBytes("使用writeBytes()方法写入数据");

        content2.close();//将DataOutputStream流关闭
        FileInputStream content3=new FileInputStream("src/word2.txt");//创建FileInputStream对象
        DataInputStream content4=new DataInputStream(content3);//创建DataInputStream对象

        System.out.println("使用writeUTF()方法写入数据为："+content4.readUTF());
        System.out.println("使用writeChars()方法写入数据为："+content4.readChar());
        System.out.println("使用writeBytes()方法写入数据为："+content4.readByte());
    }
}
