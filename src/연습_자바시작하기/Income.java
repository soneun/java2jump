package 연습_자바시작하기;

public class Income {
    public static void main(String[] args) {


        //변수 생성
        double m = 8.62;
        double t = 10.23;
        double w = 12.48;
        double h = 7.82;
        double f = 9.54;



        //총합 계산
        double result = m + t + w + h + f;

        //총합 출력
        System.out.printf("$" + "%.2f", result);


    }
}
