package 异常;

public class 创造异常 {
    static int Add(int a, int b)throws NumberAdd{  //定义方法，抛出异常
        if(a<0||a>100){
            throw new NumberAdd(a+"它的取值范围在0~100，a的范围发生异常");
        }
        if(b<0||b>100){
            throw new NumberAdd(b+"它的取值范围在0~100，a的范围发生异常");
        }
        return a+b;
    }
    public static void main(String[] args) {
        String PlayerType="monkey";
        try{
            if(!PlayerType.equals("human")){
                throw new NonePeople("这里有非人类选手"+PlayerType);
            }else{
                System.out.println("开始比赛");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("\n=================================================\n");
        int a=101,b=2;
        try {
            int result=Add(a,b);
            System.out.println(result);
        } catch (NumberAdd numberAdd) {
            numberAdd.printStackTrace();
        }
    }
}
