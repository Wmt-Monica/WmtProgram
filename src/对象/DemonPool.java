package 对象;

import 类.Pool;

public class DemonPool {
    public static void main(String[] args) {
        Pool out=new Pool();
        Pool in=new Pool();      //使用static修饰符修饰的water达到的效果可以这样使用
        System.out.println("水池里面的水量还剩"+Pool.water);
        out.outlet();
        System.out.println("水池里面的水量还剩"+Pool.water);
        in.inlet();
        in.inlet();
        System.out.println("水池里面的水量还剩"+Pool.water);
        out.outlet();
        System.out.println("水池里面的水量还剩"+Pool.water);
    }
}
