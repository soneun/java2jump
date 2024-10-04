package 연습_자바시작하기;

import java.util.ArrayList;

public class SumDigits {
    public static void main(String[] args) {

        //변수 생성
        int num = 374;
        int oneDigit = num % 10;
        System.out.println("oneDigit = " + oneDigit);
        int twoDigit = num % 100 /10;
        System.out.println("twoDigit = " + twoDigit);
        int threeDigit = num / 100;

        int totla = threeDigit + oneDigit + twoDigit;

        System.out.println("총합: " + totla);





    }
}
