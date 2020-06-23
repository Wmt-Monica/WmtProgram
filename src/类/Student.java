package 类;

public class Student {
    public String name;
    public int age;
    public long telephone;
    public String eat(){
        String name="李寅";
        System.out.println("吃很少的饭");
        return this.name+name;
    }
    public int sleep(){
        int age=20;
        System.out.println("睡充足的觉");
        return this.age+age;
    }
    public long study(){
        long telephone=123456789l;
        System.out.println("学无止境");
        return this.telephone+telephone;
    }
    public void introduce(String name,int age,long telephone){
        System.out.println("大家好，我叫"+name+"今年"+age+"岁，电话是"+telephone+"没事可以不用联系我，我这个人不喜欢被打扰");
    }
}
