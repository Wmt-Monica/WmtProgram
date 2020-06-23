package 对象;

import 类.Book;

public class DemonBook {
    public static void main(String[] args) {
        //通过Book这个类来创建一个对象，不是通过new实现，是通过向图书馆借书
        Book book=Book.LibraryBook();
    }
}
