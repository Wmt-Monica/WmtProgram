package IO流;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Reader_And_Writer_Test extends JFrame {
    /*
        private static final long serialVersionUID=1L意思是定义程序序列化ID。
        序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及
        避免在程序版本升级时程序报告的错误。
     */
    private static final long serialVersionUID = 1L;
   private Reader_And_Writer_Test(){
       setTitle("这里是输入内容到文本的窗口");
       setBounds(500,300,300,300);
       Container container=getContentPane();
       JButton jButton1=new JButton("写入文件");
       JButton jButton2=new JButton("读取文件");
       JTextArea jTextArea=new JTextArea(15,20);
       JScrollPane jScrollPane=new JScrollPane(jTextArea);
       JPanel jPanel=new JPanel(new GridLayout(1,2,20,20));
       setLayout(new BorderLayout());
       container.add(BorderLayout.NORTH,jScrollPane);
       container.add(BorderLayout.SOUTH,jPanel);
       jPanel.add(jButton1);
       jPanel.add(jButton2);

       //创造一个文本对象
       File file1=new File("D:\\WMTwork\\One.java");

       /*
            编写写入文件的点击事件
        */
       jButton1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               try {
                   /*
                        FileWriter out=new FileWriter(file1,true);
                        该句子在后面添加参数true可以实现在原内容不变动
                        的情况下在后面添加输入的内容
                    */

                   FileWriter out=new FileWriter(file1,true);//创建FileWriter对象
                   String content=jTextArea.getText();//获取文本域的文本内容
                   out.write(content);//将获取到的文本内容写入One.java文件里面
                   out.close();//将流关闭

               } catch (IOException ex) {
                   ex.printStackTrace();
               }
           }
       });

       /*
            编写读取文件按钮的点击事件
        */
       jButton2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   FileReader in=new FileReader(file1);//创建FileReader对象
                   //创建char型数组用于存放One.java文本内容的字节码文本
                   char content[]=new char[1024];
                   //将创建好的FileReader对象in的read方法将字节读入数组当中去
                   int content2=in.read(content);
                   //将FileReader对象content从0开始到内容结束的content2打印到控制台
                   System.out.println(new String(content,0,content2));
               } catch (FileNotFoundException ex) {
                   ex.printStackTrace();
               } catch (IOException ex) {
                   ex.printStackTrace();
               }
           }
       });
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Reader_And_Writer_Test();
    }
}
