package 随机数;

import java.util.Random;
import java.util.Scanner;

public class hongbao {
    public static void main(String[] args) {
        Random money=new Random();
        System.out.println("请输入你要塞进红包的金额");
        Scanner num1=new Scanner(System.in);
        Double num2=num1.nextDouble();
        System.out.println("请输入要分成包的个数");
        Scanner num3=new Scanner(System.in);
        Double num4=num1.nextDouble();
        for(int i=0;i<num4;i++){
            //产生一个double的随机数
            //最小发多少红包
            double min=0.01;
            //最大发多少金额
            double max=num2-(num4-i-1)*min;
            double num=(double)money.nextInt((int)((max)*100))/100;
            System.out.println("第"+i+"个红包的金额为"+String.format("%.2f",num));
            num2=num2-num;
        }
        System.out.println("最后一个包的金额为"+String.format("%.2f",num2));
    }
}
