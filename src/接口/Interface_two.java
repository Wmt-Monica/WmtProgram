package 接口;

public interface Interface_two {
    public default void Five(){
        System.out.println("我是Interface_two里面的默认方法");
    }
    abstract void six();
    public default void seven(){

    }
}
