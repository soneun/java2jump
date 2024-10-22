package 연습_자바API;



import java.util.ArrayList;

public class TotalPrice {
    public static void main(String[] args) {
        //구매 상품 등록
      Item shirt = new Item("스트라이프셔츠", 49900);
      Item pants = new Item("슬림 면바지", 58900);
      Item shoes = new Item("스니커즈", 46900);

      //장바구니 생성 및 담기
        Cart myCart = new Cart();
        myCart.add(shirt);
        myCart.add(pants);
        myCart.add(shoes);

        //총합 출력
        System.out.printf("총합: %d원", myCart.totalPrice());


    }
}
class Cart{
    private ArrayList<Item> list;

    Cart(){
        this.list = new ArrayList<Item>();
    }
    public void add(Item item){
        list.add(item);
    }
    public int totalPrice(){
        int sum = 0;
        for (Item i : list) {
            sum += i.getPrice();

        }
        return sum;
    }
}
class Item{
    private String name;
    private int price;

     Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
