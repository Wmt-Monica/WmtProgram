package 对象;

public class DemonBookTest {
    String i="红楼梦";
    public String show(){
        return i;
    }

    public static void main(String[] args) {
      //(类         )(引用)(对象的实体         )
        DemonBookTest test=new DemonBookTest();
        System.out.println(test.i);
        System.out.println(new DemonBookTest().show());
    }
}
