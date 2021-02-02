package Day02.集合框架.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

class Book {

    String name;
    double price;

    public Book(String name, double price) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[书名：" + this.name + " 价格：" + this.price + "]";
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Book b = (Book) obj;
        return this.name.equals(b.name);
    }
}


public class Demo {
    public static void main(String[] args) {
        //不允许重复，建立HashSet，添加三本书
        HashSet<Book> books = new HashSet<Book>();
        books.add(new Book("三国", 34));
        books.add(new Book("红楼", 78));
        books.add(new Book("红楼", 78));
        // books.remove(new Book("三国",34));

        //修改书名
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.name.equals("三国")) {
                b.name = "三国演义";
            }
        }
        //改名字后不能删
        books.remove(new Book("三国演义", 34));
        System.out.println("集合的元素： " + books);
    }
}