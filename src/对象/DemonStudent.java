package 对象;

import 类.Student;

public class DemonStudent {
    public static void main(String[] args) {
        //根据Student类创建一个stu这个对象
        Student stu = new Student();
        stu.name="王梦婷";
        stu.age=19;
        stu.telephone=18307988122l;
        stu.eat();
        System.out.println(stu.eat());
        stu.sleep();
        System.out.println(stu.sleep());
        stu.study();
        System.out.println(stu.study());
        stu.introduce(stu.name,stu.age,stu.telephone);
    }
}
