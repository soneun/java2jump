package 연습_클래스;

public class SquareTest {
    public static void main(String[] args) {
        //객체 생성
        Square s = new Square();

        //필드 초기화
        s.length = 4;

        //결과 출력
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s.length, s.area());


    }
}

//정사각형 클래스 구현
class Square{
    int length;//길이

    int area(){//넓이 반환
        return length*length;
    }

}
