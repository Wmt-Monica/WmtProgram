package 接口;

public class Fu_Achieve {
    public void eight(){
        System.out.println("这里是父类的eight方法，如果子类继承我这个父类的方法，");
        System.out.println("同时有与接口里面的默认方法重名起冲突时，由于优先级的缘故，是继承我这个父类的方法的");
    }
}
