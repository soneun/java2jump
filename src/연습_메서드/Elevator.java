package 연습_메서드;

public class Elevator {
    public static void main(String[] args) {

        int a = 13;
        int b = 7;
        int c = 10;
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));


    }
    public static String guide(int num){
        if(11<=num)
          return "고층 엘레베이터";
        else
           return "저층 엘레베이터";
    }
}