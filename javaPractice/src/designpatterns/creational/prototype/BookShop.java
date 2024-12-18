package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

// as Object class clone() method is protected so we need to implements Cloneable interface
public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }



    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
    //imagine data comes from database . so for demo purpose i am adding data here manually
    public void loadData() {
        for (int i = 1; i <= 5; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setbName("Book " + i);
            getBooks().add(b);
        }
    }
    //this is shallow cloning
   /* @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    //this is deep cloning
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book b : this.getBooks()) {
            shop.getBooks().add(b);
        }
        return shop;
    }

}
