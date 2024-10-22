package 연습_상속;

public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);


    }
}
interface Meter{
    public int Base_FARE = 3000;
    public abstract void start();
    public abstract int stop(int distance);
}
class Taxi implements Meter{
    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");

    }

    @Override
    public int stop(int distance) {
       int fare = Base_FARE + distance * 2;
        System.out.println("운행을 종료하니다.요금은 "+ fare+ "원입니다.");
        return fare;



    }


}