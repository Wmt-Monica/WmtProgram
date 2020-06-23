package 类;

public class Book {
    //私有一个Book类
    private Book(){

    }
    //使用静态公开法，向图书馆借书
    static public Book LibraryBook(){
        return new Book();
    }
}
