package 연습_상속;

class Drink{
    String name;
    double price;
    public void ordered(){
        System.out.println("주문되었습니다.");
    }
}
class Juice extends Drink{

}
class Coffee extends Drink{

}
class Beer extends Drink{

}
class Water extends Drink{

}
class Tea extends Drink{

}

public class DrinkTest {
    public static void main(String[] args) {
        Juice juice = new Juice();
        Coffee coffee = new Coffee();
        Beer beer = new Beer();
        Water water = new Water();
        Tea tea = new Tea();

        //부모 클래스 타입의 배열 생성
        Drink[] drinks = {juice, coffee, beer, water, tea};

        //모든 음료 주문!
        for (Drink d : drinks) {
            d.ordered();

        }


    }
}
