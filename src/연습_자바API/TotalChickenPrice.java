package 연습_자바API;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        //ArrayList 생성
        ArrayList<Chicken> order = new ArrayList<Chicken>();

        //주문한 치킨을 ArrayList에 추가하세요.
        order.add(new Chicken("로스트",9900));
        order.add(new Chicken("파닭",12900));
        order.add(new Chicken("마늘아",13900));
        
        //ArrayList를 순회하여 총합을 구하세요
        int sum = 0;
        for (Chicken c : order) {
            sum += c.getPrice();

        }
        //결과 출력
        System.out.printf("총합: %d원\n", sum);
    }
}
class Chicken{
    private String name;
    private int price;

    Chicken(String name, int price){
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
