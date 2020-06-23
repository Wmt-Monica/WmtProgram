package String;

public class length {
    public static void main(String[] args) {
        String wmt = "fdbdb vFEFDHGfsd sdfg fg";
        System.out.println(wmt.length());
        System.out.println(wmt.toLowerCase());
        System.out.println(wmt.toUpperCase());
        String ly = "I am a good girl";
        System.out.println("第一个g出现的位置" + ly.indexOf("g") + "最后g出现的位置" + ly.lastIndexOf("g"));
        System.out.println(ly.replace("girl", "boy"));
        String one = "abcdefg";
        String two = "gfedcba";
        StringBuilder one2 = new StringBuilder(one);
        String one3 = one2.reverse().toString();
        boolean panduan = one3.equals(two);
        System.out.println("是否为回文：" + panduan);
        System.out.println("*" + 10 + 20);
        System.out.println(10 + "*" + 20);
        System.out.println(10 + 20 + "*");
        System.out.println(20 + '*');
        System.out.printf("E=%5s,Pi=%.2f,String=%5s,char=%5c", "HDCZYJ", Math.PI, Math.E, 'A');
        String s = "127";
        int i=Integer.parseInt(s);
        Double i1=Double.parseDouble(s);
        int i2=Integer.valueOf(s);
        System.out.println("\n"+i+" "+i2);
        System.out.println(10/3);
        System.out.println(3/6*12);
        System.out.println(3.0/6*12);

        try {
            int  b[]={1,2,3};
            b[3]=0;}
        catch(Exception e)
        {System.out.print("0");}
        {System.out.print("1");}
        System.out.println("2");
        for (int i6 = 0; i6 < 6; i6++) {

            System.out.print(i6 + ",");

            while (++i6 < 5) {
                continue;
            }
            System.out.print(i6);
        }
        class A {
            A( ) {
                System.out.print("A");
            }}
        class B extends A {
            B( ) {
                System.out.print("B");
            }
        }
                B b = new B();
    }
}


