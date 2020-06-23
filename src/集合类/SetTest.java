package 集合类;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SetTest implements Comparable<Object> {

    String name;
    int age;

    public SetTest(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    /*
        采用SetTest类实现遍历集合且按照自然顺序增序，但是不能在按照排序的依据
        数据中有重复的不然不能存入数据当中去排序
     */
    public int compareTo(Object o) {
        SetTest setTest=(SetTest) o;
        if(this.age<setTest.age){
            return -1;
        }else if(this.age==setTest.age){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        SetTest stu1=new SetTest("小王",16,"B190108");
        SetTest stu2=new SetTest("小杜",20,"C190107");
        SetTest stu3=new SetTest("小胡",18,"B190108");
        SetTest stu4=new SetTest("小洪",19,"E190103");
        SetTest stu5=new SetTest("小戴",17,"C190102");
        SetTest stu6=new SetTest("小张",22,"S190104");
        SetTest stu7=new SetTest("小郭",21,"B190108");
        //使用TreeSet类实现遍历集合按照自然递增顺序
        TreeSet<SetTest> tests=new TreeSet<>();
        //添加数据
        tests.add(stu1);
        tests.add(stu2);
        tests.add(stu3);
        tests.add(stu4);
        tests.add(stu5);
        tests.add(stu6);
        tests.add(stu7);
        //Set集合中所有对象的迭代器  迭代器实例化对象 iterator
        Iterator<SetTest> iterator=tests.iterator();
        System.out.println("Set集合中所有元素");
        //遍历集合
        while(iterator.hasNext()){
            SetTest setTest=(SetTest)iterator.next();
            System.out.println(setTest.getName()+" "+setTest.getAge()+" "+setTest.getId());
        }
        System.out.println("======================================================================");



        /*
            采用headSet()方法才实现截取排序
         */
        iterator=tests.headSet(stu4).iterator();
        System.out.println("stu4前面的部分集合");
        while (iterator.hasNext()){
            SetTest setTest=(SetTest)iterator.next();
            System.out.println(setTest.getName()+" "+setTest.getAge()+" "+setTest.getId());
        }
        System.out.println("======================================================================");



        /*
            采用subSet()方法来实现遍历集合，这个类可以实现两头截取
         */
        iterator=tests.subSet(stu2,stu6).iterator();
        System.out.println("(stu2~stu6]范围内的部分集合,这里不包括stu2,但包括stu6,左开右闭的范围");
        while (iterator.hasNext()){
            SetTest setTest=(SetTest) iterator.next();
            System.out.println(setTest.getName()+" "+setTest.getAge()+" "+setTest.getId());
        }


        System.out.println("======================================================================");
        System.out.println("使用first()方法获取Set中各个集合中第一个也是最低的那个元素，也就是" +
                "第一个输入的数据，在之前由于排好序了原因就按照排好序的来");
        System.out.println(tests.first().age);
        System.out.println(tests.first().name);
        System.out.println(tests.first().id);


        System.out.println("======================================================================");
        /*
            这里同样可以用last()方法来调用输出最后一个元素
         */
        System.out.println(tests.last().age);
        System.out.println(tests.last().name);
        System.out.println(tests.last().id);

    }
}
