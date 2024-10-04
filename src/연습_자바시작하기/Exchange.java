package 연습_자바시작하기;

public class Exchange {
    public static void main(String[] args) {

        //유로 입력
        int euro = 52;
        int dollar = 32;

        //1. 환율 변수 생성
        double euroToKwnRate = 1281.62664;
        double dollarToKwnRate = 1091.70306;

        //2. 환전 결과 계산
        double euroKwn = euro * euroToKwnRate;
        double dollarKwn = dollar * dollarToKwnRate;

        double result = euroKwn + dollarKwn;

        //결과출력
        System.out.printf("환전결과 : " + "%.0f원",result );

    }
}
