package designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("novelty");
        bs.loadData();
        //but suppose if i remove any data from this object it will also
        // get remove from bs1 object as its is shallow copy
        //bs.getBooks().remove(2);
        System.out.println(bs);

        //this is shallow copy
        /*BookShop bs1 =(BookShop)bs.clone();
        bs.setShopName("AI");
        bs.loadData();
        System.out.println(bs);*/

        //this is deep copy
        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs.setShopName("AI");
        System.out.println(bs);
    }
}
