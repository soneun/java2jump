package 연습_메서드;

public class RareItem {
    public static void main(String[] args) {

        wear(2400, 2000);
        wear(3800, 1200);
    }

    public static void wear(int hp, int mp) {
        if(hp<2000)
            System.out.println("아이템을 착용할 수 없습니다.");
        else if(mp<2000)
            System.out.println("아이템을 착용할 수 없습니다.");
        else
            System.out.println("아이템 장착 완료!");
    }
}
