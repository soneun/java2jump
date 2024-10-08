package 연습_메서드;

public class Walking {
    public static void main(String[] args) {
        //칼로리 계산을 위해 메소드 호출
        double result = calculateCalory(5000);
        System.out.println("소모 칼로리: " + result + "kcal");



    }
    //칼로리 계산 메소드 정의
    private static double calculateCalory(int walk){
        return 0.02 * walk;
    }
}
