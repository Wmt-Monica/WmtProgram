package IO流;

import java.io.*;

public class Input_And_Output_Test {
    public static void main(String[] args) throws IOException {
        File file1=new File("word.txt");  //创建文件对象file1

        /*
            将一些内容写入文件当值去
            并用try catch 语句来进行捕获
         */
        try {
            FileOutputStream out=new FileOutputStream(file1);  //创建FileOutputStream对象
            byte content[]="这里是word.txt中的内容".getBytes();  //创建byte型数组 (字节数组)
            out.write(content);  //将数组写入文件word.txt当中去
            out.close();  //注意写入之后一定要记得关闭字节流
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
            将文件中的内容输出
            并用try catch 语句来进行捕获
         */
        try {
            //创建 FileInputStream对象
           FileInputStream in=new FileInputStream(file1);
            byte byt[]=new byte[1024];  //创建byte数组  (字节数组)
            int content1=in.read(byt);  //从文件对象 in 读取内容
            System.out.println("文件中的内容是："+new String(byt,0,content1));  //将读取到的内容打印输出
            in.close();  //关闭输出流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

