package Wmtjava;

public class Boolean {
    public static void main(String[] args) {
        System.out.println(java.lang.Boolean.TRUE);
        System.out.println(java.lang.Boolean.FALSE);
        System.out.println("==============================");

        java.lang.Boolean b1= java.lang.Boolean.valueOf(true);
        java.lang.Boolean b2= java.lang.Boolean.valueOf(false);
        java.lang.Boolean b3= java.lang.Boolean.valueOf("true");
        java.lang.Boolean b4= java.lang.Boolean.valueOf("false");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("==============================");

        if(b1){
            System.out.println(b2);
        }
        System.out.println("==============================");
        if(b3){
            System.out.println(b4);
        }


    }
}
