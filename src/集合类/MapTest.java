package 集合类;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>(); //创造MAp实例
        //向实例集合添加对象
        map.put("01","王同学");
        map.put("02","李同学");
        map.put("03","张同学");
        map.put("04","胡同学");
        //构造Map集合中所有Key对象的集合
        Set<String> set=map.keySet();
        //创造集合迭代器
        Iterator<String>iter=set.iterator();
        System.out.println("key集合中的元素：");
        //遍历集合
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        System.out.println("==============================================================");
        //构造Map集合中所有的values值的集合
        Collection<String>collection=map.values();
        iter=collection.iterator();
        System.out.println("values集合中的元素是：");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        System.out.println("==============================================================");
        if(map.containsKey("03")){
            System.out.println("key集合中是否存在03的值"+map.containsKey("03"));
        }


        System.out.println("==============================================================");
        System.out.println("key对象中的所有集合"+map.keySet());
        System.out.println("所有集合所对应的value的值"+map.values());


        System.out.println("==============================================================");
        System.out.println("相集合添加或改变指定的key以及所对应的value的映射关系");
        map.put("02","郭同学");
        System.out.println(map.values());


        System.out.println("==============================================================");
        if(map.containsValue("郭同学")){
            System.out.println("是否在集合内部存在value的值存在郭同学"+map.containsValue("郭同学"));
            System.out.println("是否在集合内部存在value的值存在李同学"+map.containsValue("李同学"));
        }


        System.out.println("==============================================================");
        System.out.println("是否存在key为04的值"+map.get("04"));
        System.out.println("是否存在key为09的值"+map.get("09"));

    }
}
