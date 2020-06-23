package IO流;

import java.io.*;

public class homework {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\WMTwork\\Two");
        File[] dirfile = file.listFiles();
        //遍历数组
        for (File f : dirfile) {
            //如果是文件且后缀名是s的就直接打印
            if(f.isFile()&&f.getName().endsWith(".java")){
                System.out.println(f+"是Java文件");
            }
        }
    }
}
