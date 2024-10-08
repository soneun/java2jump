package 연습_메서드;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득금액: $%.2f(%.0f원)", dollar, won);

    }
    public static int dice(){

        return (int)(Math.random()*6)+1;

    }
    public static double exchange(double dollar){
        return dollar * 1082.25108;
    }

}

