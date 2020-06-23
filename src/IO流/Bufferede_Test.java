package IO流;

import java.io.*;

public class Bufferede_Test {
    public static void main(String[] args) throws IOException {
        //创建一个文件对象
        File file1=new File("word.txt");
        long start=System.currentTimeMillis();  //开始时间
        //创建一个BufferedInputStream对象
        BufferedInputStream inputStream1=null;
        //创建一个FileInputStream对象
        FileInputStream inputStream2=new FileInputStream(file1);
        //将文件字节流包装成缓冲字节流
        inputStream1=new BufferedInputStream(inputStream2);
        byte content1[]=new byte[1024];
        //读取文本文件
        while (inputStream1.read(content1)!=-1){
            System.out.println("============");
        }
        long end=System.currentTimeMillis();  //结束时间
        System.out.println("文本读取所经历的毫秒"+(end-start));
    }
}
