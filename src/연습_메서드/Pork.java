package 연습_메서드;

public class Pork {
    public static void main(String[] args) {
        //변수 생성
        int n = 3;
        //메소드를 통한 칼로리 계산
        double result = calorieCalculator(n);
        //결과 출력
        System.out.printf("삼겹살 %d인분: %.2f kcal",n, result);


    }

    //칼로리 계산 메소드 정의
    public static double calorieCalculator(int n){
        return 180 * 5.179 * n;
    }
}
