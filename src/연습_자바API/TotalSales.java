package 연습_자바API;

import java.awt.*;
import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        Menu a = new Menu("김밥",2000, 57);
        Menu b = new Menu("돈까스", 6000, 29);
        Menu c = new Menu("냉면", 5000, 34);

        Store store = new Store();
        store.add(a);
        store.add(b);
        store.add(c);

        System.out.printf("총매출: %d원", store.totalSales());



    }
}
class Store{
    private ArrayList<Menu>list;

    Store(){
        list = new ArrayList<Menu>();
    }
    public void add(Menu menu){
        list.add(menu);
    }
    public int totalSales(){
        int sum = 0;
        for (Menu m : list) {
            sum+= m.getPrice()*m.getCount();
        }
        return sum;
    }
}
class Menu{
    private String name;
    private int price;
    private int count;

    Menu(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public int getPrice(){
        return price;
    }
    public int getCount(){
        return count;
    }
}
