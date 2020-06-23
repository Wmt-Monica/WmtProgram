package 内部类;
//匿名内部类的创建
public class Three {
    public OutInterface3 Action(){
        return new OutInterface3() {
            private int i=1;
            public int getValue(){
                return i;
            }
        };
    }

}
interface OutInterface3{

        }