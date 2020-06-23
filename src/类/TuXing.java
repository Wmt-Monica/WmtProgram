package 类;

public class TuXing {
    final static double PI = 3.1415926;

    public static void main(String[] args) {
        yuan a=new yuan(3.0);
        qiu b=new qiu(3.0);
    }
}
        class yuan {
            double banjin;
            double mainji;

            //构造方法，和类的名称一样，作用是将这个类的变量进行初始化
            public yuan(double banjin) {
                this.banjin = banjin;
                System.out.println("圆的半径为" + this.banjin);
                mainji = TuXing.PI * banjin * banjin;
                System.out.println("圆的面积为" + mainji);
            }
        }

        class qiu {
            double banjin;
            double mainji;

            //构造方法，和类的名称一样，作用是将这个类的变量进行初始化
            public qiu(double banjin) {
                this.banjin = banjin;
                System.out.println("球的半径为" + this.banjin);
                mainji =4/3* TuXing.PI * banjin * banjin*banjin;
                System.out.println("圆的面积为" + mainji);
            }
        }

