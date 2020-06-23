package IO流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip_Test {
    private void zip(String ZipFileName, File inputFile) throws IOException {

        /*
            FileOutputStream content=new FileOutputStream(inputFile);
            ZipOutputStream content1=new ZipOutputStream(content);
            前面两句和下面一句代码的效果一样
            ZipOutputStream content=new ZipOutputStream(new FileOutputStream(ZipFileName));
         */


       //创建 ZipOutputStream 类对象
        ZipOutputStream content=new ZipOutputStream(new FileOutputStream(ZipFileName));
        //调用zip()方法对文件进行压缩
        zip(content,inputFile,"");
        content.close();//关闭 ZipOutputStream流
    }

    /*
        编写zip()方法
        content  ZipOutputStream对象
        inputFile 文件路径
        s 文件内容
     */
    private void zip(ZipOutputStream content, File inputFile, String s) throws IOException {
        //isDirectory()方法  判断该路径下的文件是否为一个目录(文件夹)
        if(inputFile.isDirectory()){
            /*
                listFiles()方法是返回某个目录下的所有文件和目录的绝对路径，返回值为File型
             */
            File[] file=inputFile.listFiles();//获取路径数组


            if(s.length()!=0){
                content.putNextEntry(new ZipEntry(s));//写入此目录的entry
            }


            for(int i=0;i<file.length;i++){  //循环遍历数组中的文件
                zip(content,file[i],s+file[i]);
            }
        }else {
            content.putNextEntry(new ZipEntry(s));//创造新的进入点
            FileInputStream inputStream=new FileInputStream(inputFile);//创造 FileInputStream 对象
            int b;
            System.out.println(s);
            while ((b=inputStream.read())!=-1){//如果没有到达文件的尾部
                content.write(b);//在压缩文件中写入源文件的内容
            }

            inputStream.close();//关闭 FileInputStream 流
        }
    }

    public static void main(String[] args) throws IOException {
        Zip_Test test=new Zip_Test();//创建本例的对象
        //调用方法  第一个参数为压缩后的文件  第二个参数为准备压缩的文件
        try {
            test.zip("D:\\WMTwork\\Two.zip", new File("D:\\WMTwork\\Two"));
            System.out.println("压缩完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
