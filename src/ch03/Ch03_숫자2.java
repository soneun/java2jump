package ch03;

public class Ch03_숫자2 {
    public static void main(String[] args) {

        //정수 타입(int가 기본)
        int age = 10;
        long count = 232165465422554L;

        //실수 타입(double이 기본)
        float pi = 3.14f;
        double pi2 = 3.145654545464;

        //8진수(0)와 16진수(0x)
        int oxtal = 023;
        int hex = 0xC3;
        System.out.println(oxtal);
        System.out.println(hex);

        //숫자 연산(+ - * /) : 사칙연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3);//나머지 % 기호
        System.out.println(3%7);

        //증감연산 (++, --)1씩 증가, 감소
        int i = 0; // = i+1
        int j = 10;// = j-1
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);

        //증감연산자가 앞에 있을 떄 먼저 증감 뒤에는 뒤에 증감
        System.out.println(++i);//2
        System.out.println(j--);//9
        System.out.println(j);//8

        int x = i++;//x = 2, i = 3
        int y = i + --j;//y = 10 , i = 3, y = 7

        System.out.println(x);
        System.out.println(y);
    }

}
