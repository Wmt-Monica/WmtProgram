package IO流;

import javax.swing.*;
import java.io.*;

public class Progress_Monitor_InputStream_Test {
    public static void main(String[] temp) throws IOException, InterruptedException {
        byte b[]=new byte[1024];  //创建字节数组

        try {
            //创建FileInputStream对象
            FileInputStream file1=new FileInputStream("D:\\WMTwork\\One.java");

            //读取文件时的出现读取进度条
            ProgressMonitorInputStream in=
                    new ProgressMonitorInputStream(null,"读取文件",file1);

            //读取数据内容并打印在控制台中
            while (in.read(b)!=-1){
                String content=new String(b);
                System.out.println(content);
                //暂停程序  时间单位 ms
                Thread.sleep(2000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
