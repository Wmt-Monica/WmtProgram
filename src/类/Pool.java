package 类;

public class Pool {
    //使用static静态这个修饰符使得water这个变量变更为大家都可见的，公用的
    static public int water=0;
    public void outlet(){
        if(water>=2){
            water-=2;
        }else{
            water=0;
        }
    }
    public void inlet(){
        water+=3;
    }
}
