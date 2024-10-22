package ch07_6;

interface Calculator{
    int sum(int a, int b);
}

class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

public class Ch07_함수형 {
    public static void main(String[] args) {
        //일반적인 클래스로 객체를 만들 경우
       Calculator mc = new MyCalculator();
       int result = mc.sum(3, 4);
        System.out.println(result);

        //람다식으로 익명 클래스를 대체
        Calculator mc2 = (int a, int b)->a+b;
        int result1 = mc2.sum(3,4);
        System.out.println(result1);


    }
}
