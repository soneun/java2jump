package 연습_자바시작하기;

import java.util.Scanner;

public class Alba {
    public static void main(String[] args) {

        //변수 생성
       Scanner input = new Scanner(System.in);
       int basepay = input.nextInt();
       int hours = input.nextInt();

       //총합 계산
        int pay = basepay * hours;

        //출력
        System.out.println(pay);


    }
}
