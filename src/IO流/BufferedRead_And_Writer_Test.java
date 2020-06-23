package IO流;

import java.io.*;

public class BufferedRead_And_Writer_Test {
    public static void main(String[] args) throws IOException {
        String content[]={"这是第一句话","这是第二句话","这是第三句话"};//定义字符串数组
        File file1=new File("D:\\WMTwork","Hello.java");//定义文件对象
        file1.createNewFile();//新建Hello.java文件


        try {//使用try catch来捕获一些可能出现的异常
            FileWriter writer1=new FileWriter(file1);//创建FileWriter对象
            BufferedWriter writer2=new BufferedWriter(writer1);//由FileWriter对象创建BufferedWriter对象
            for(int i=0;i<content.length;i++){//循环遍历数组
                writer2.write(content[i]);//将字符串中的元素写入Hello.java文件当中去
                writer2.newLine();//将数组中的元素翊单行的形式写入文件
                writer2.flush();//刷新该流的缓存
            }
            writer2.close();//将BufferedWriter流关闭
            writer1.close();//将FileWriter流关闭
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {//使用try catch来捕获一些可能出现的异常
            FileReader reader1=new FileReader(file1);//创建FileReader对象
            BufferedReader reader2=new BufferedReader(reader1);//创建BufferedReader对象
            String content1=null;//创建字符串对象
            int i=0;
            //如果文件的文本行数不为null,则进入循环
            while ((content1=reader2.readLine())!=null){
                i++;
                System.out.println("第"+i+"行的内容是："+content1);//打印文本中的内容
            }
            reader2.close();//将BufferedReader流关闭
            reader1.close();//将FileReader流关闭
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
