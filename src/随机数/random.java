package 随机数;

import com.sun.jdi.Value;

public class random {
    //随机数的默认是[0,1)的
    //随机数的取值是左闭右开

    /*定义一个产生2~100偶数的方法
          number1为起始
          number2为结尾
    */
//    public static int GetNumber(int number1,int number2){
//        int num=(int)number1+(int)(Math.random()*(number2-number1));
//        if(num%2==0){
//            return num;
//        }else{
//            return num+1;
//        }
//    }
//    /*
//    定义一个随机出a~z的随机小写字母
//    范围char a~char z
//     */
//    public static char GetChar(char a,char z){
//        char one=(char)(a+Math.random()*(z-a+1));
//        return one;
//    }
    public static void main(String[] args) {
        //因为设置为static属性所以可以不用通过类名称调用直接通过方法调用即可
//        for(int i=0;i<100;i++){
//            System.out.println("这是1~100以内偶数的随机数"+GetNumber(1,100));
//        }
//        System.out.println("==============================");
//        for(int i=0;i<100;i++){
//            System.out.println("这是a~z随机小写字母"+GetChar('a','z'));
        String yanzhengma = "";

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                int num = (int) (1 + Math.random() * 255);
                if (num >= 0 && num <= 9) {
                    yanzhengma += num;
                } else if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
                    yanzhengma += ((char) (num));
                    //  System.out.println((yanzhengma));
                } else {
                    i--;
                }
            }
            System.out.println(yanzhengma);
            yanzhengma = "";
        }

        

        int n = 0;
        while (true) {
            int num = (int) (1 + Math.random() * 255);
            if (num >= 0 && num <= 9) {
                yanzhengma += num;
                n++;
            } else if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
                yanzhengma += ((char) (num));
                n++;
                //  System.out.println((yanzhengma));
            }
            if (n == 5) {
                System.out.println(yanzhengma);
                yanzhengma = "";
                break;
            }
        }
    }
}
