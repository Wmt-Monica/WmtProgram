package 集合类;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        //实例化集合对象
        Collection<String> list=new ArrayList<>();
        //向集合添加数据
        list.add("a");
        list.add("b");
        list.add("c");
        //创造迭代器
        Iterator<String> it=list.iterator();
        //判断是否有下一个元素
        while (it.hasNext()){
            //获取集合中的元素
            String string=(String) it.next();
            System.out.println(string);
        }
        System.out.println("================================================================");


        System.out.println("现在集合中的个数为"+list.size());
        System.out.println("================================================================");


        System.out.println("以下将移除指定");
        list.remove("b");
        System.out.println("现在集合中的个数为"+list.size());
        System.out.println("================================================================");


        System.out.println("list集合是否为空"+list.isEmpty());
        System.out.println("================================================================");


    }
}
