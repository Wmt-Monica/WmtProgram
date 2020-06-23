package IO流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Zip_Test2 {
    public static void main(String[] args) throws IOException {
        File file1=new File("D:\\WMTwork\\Three.zip");

        ZipInputStream zipInputStream;//创造 ZipInputStream 对象

        ZipFile zipFile=new ZipFile(file1);//创造压缩文件对象

        //实例化 ZipInputStream 对象
        zipInputStream=new ZipInputStream(new FileInputStream(file1));

        ZipEntry entry=zipInputStream.getNextEntry();//跳过根目录，获取下一个ZipEntry

        //如果entry不为空，并不在同一目录下
        while (((entry=zipInputStream.getNextEntry())!=null)&&!entry.isDirectory()){
            File tmp=new File("D:\\"+entry.getName());//解压文件的路径
            if(!tmp.exists()){//如果该文件不存在

                tmp.getParentFile().mkdirs();//创建文件父类的文件夹路径

                OutputStream outputStream=new FileOutputStream(tmp);//将文件目录中的文件放入输出流

                InputStream inputStream=zipFile.getInputStream(entry);//用输入流读取压缩文件中制定目录中的文件

                int count=0;//创建临时变量

                while ((count=inputStream.read())!=-1){//用输入流将原原件目录下的文件里面的内容写入相应的文件当中去

                    outputStream.write(count);//用输出流写入

                }

                outputStream.close();//关闭输出流
                inputStream.close();//关闭输入流
            }
            zipInputStream.closeEntry();

        }
        zipInputStream.close();
   }
}
