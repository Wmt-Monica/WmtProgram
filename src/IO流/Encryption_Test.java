package IO流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption_Test {
    public static void main(String[] args) throws IOException {
        //toCharArray()方法是将字符串转换为字符数组
        char content1[]="这是未加密前的文本".toCharArray();

        try {
            File fine1=new File("src/word2.txt");//设置File对象

            for(int i=0;i<content1.length;i++){
                //这里原来的文本与R异或，之后再强制转换未字符存入数组当中
                content1[i]=(char)(content1[i]^'R');
            }

            //创建FileWriter对象指定存入 word2.txt 文本当中
            FileWriter content2=new FileWriter(fine1);

            //从0开始到文本长度尾部位置的写入word.txt文件当中去
            content2.write(content1,0,content1.length);

            //关闭输入流
            content2.close();

            //创建FileReader对象0
            FileReader content3=new FileReader(fine1);

            //设置字符数组变量
            char content4[]=new char[1024];
            System.out.print("文本加密之后为：");

            //
            int num=0;
            int length=(int)(content1.length);
            while ((num = (content3.read(content4, 0, length)))!=-1){

                //将字符数组转换为字符串
                String s=new String(content4,0,length);
                System.out.print(s);
            }

            System.out.println();


            System.out.println("======================================================");


            content3.close();//关闭输出流

            //接下来遍历文本中的内容打印在控制台上面
            content3=new FileReader(fine1);
            System.out.print("明文：");
            while ((num=content3.read(content4,0,length))!=-1){
                for(int j=0;j<num;j++){
                    content4[j]=(char)(content4[j]^'R');
                }

                //将字符数组转换为字符串
                String s=new String(content4,0,num);
                System.out.printf(s);
            }

            content3.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
