package IO流;

import java.io.*;
import java.util.Scanner;

public class File_Test {
    public static void main(String[] args) throws IOException {
        /*
            创建一个文件对象file1,其中一种路径方法
         */
        File file1=new File("D:\\WMTwork\\One.java");
        if(file1.exists()){
            System.out.println("该文件存在");
        }else {
            System.out.println("该文件不存在");
        }


        /*
            创造一个文件对象file2,另一种路径方法
         */
        File file2=new File("D:\\WMTwork","One.java");
        if(file2.exists()){
            System.out.println("该文件存在");
        }else {
            System.out.println("该文件不存在");
        }


        /*
            创造文件的最后一种方法
         */
        File dir=new File("D:\\WMTwork");
        File file3=new File(dir,"One.java");
        if(file3.exists()){
            System.out.println("该文件存在");
        }else {
            System.out.println("该文件不存在");
    }


        /*
                另一种在项目中创造一个文件由三种方法，
                一种是在项目下创建   file5
                一种是咋src目录下创造   file6
                一种是在包下创造   file7
         */
        File file5=new File("word.txt");

        if(file5.exists()){
            System.out.println("该文件存在");
        }else {
            System.out.println("该文件不存在");
        }
        System.out.println("=========================================================");


        File file6=new File("src/word2.txt");

        if(file6.exists()){
            System.out.println("该文件存在");
        }else {
            System.out.println("该文件不存在");
        }
        System.out.println("=========================================================");


        File file7=new File("src/IO流/word3.txt");

        if(file7.exists()){
            System.out.println("该文件存在");
        }else {
            System.out.println("该文件不存在");
        }
        System.out.println("=========================================================");


        /*
            文件的删除  delete()方法
         */
        System.out.println("是否删除One.java文件？，如果删除请输入true,否则输入false");
    Scanner Choice=new Scanner(System.in);
    Boolean choice=Choice.nextBoolean();
        if(choice==true){
        file1.delete();
        System.out.println("文件One.java已经删除");
    }

        /*
            创造新的文件 createNewFile()方法
         */
        System.out.println("是否在D:\\WMTwork位置存在Two.java文件");
        File file4=new File("D:\\WMTwork","Two.java");
        System.out.println(file3.exists());
        if(file4.exists()==false){
            System.out.println("是否创建该文件,如果创建请输入true,否则输入false");
            Scanner Choice1=new Scanner(System.in);
            Boolean choice1=Choice1.nextBoolean();
            if(choice1==true){
                file4.createNewFile();
                System.out.println("Two文件已经被成功创建");
            }
        }


        /*
            File类中还有很多其他的方法
         */
        //1.获取文件名
        System.out.println(file1.getName());

        //2.判断文件是否可读
        System.out.println(file1.canRead());

        //4.判断文件是否可以被写入
        System.out.println(file1.canWrite());

        //5.判断文件是否存在
        System.out.println(file1.exists());

        //6.获取文件的长度（字节为单位）
        System.out.println(file1.length());

        //7.获取文件的绝对路径
        System.out.println(file1.getAbsolutePath());

        //8.获取文件的父路径
        System.out.println(file1.getParent());

        //9.判断文件是否存在
        System.out.println(file1.isFile());

        //10.判断文件是否为一个目录(是否为一个文件夹）
        System.out.println(file1.isDirectory());

        //11.判断文件是否为隐藏文件
        System.out.println(file1.isHidden());

        //12.获取文件最后修改的时间
        System.out.println(file1.lastModified());

    }
}
