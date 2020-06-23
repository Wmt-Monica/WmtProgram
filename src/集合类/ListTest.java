package 集合类;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //创造集合对象
        List<String> list=new ArrayList<>();
        //向集合添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        //获取集合大小[0~2)范围的随机数
        int i=(int)(Math.random()*list.size());
        System.out.println("获取的集合内随机的序列"+i+" 内容为"+list.get(i));
        //将指定索引位置的元素从集合删除
        list.remove(2);
        System.out.println("将索引序列位置的元素删除后，数组的元素是：");
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
        System.out.println("======================================================");
        System.out.println("用get()方法获得指引位置的元素");
        System.out.println(list.get(1));


        System.out.println("======================================================");
        System.out.println("采用set()方法指定索引位置并修改");
        list.set(1,"这里的内容已经被修改了");
    }
}
