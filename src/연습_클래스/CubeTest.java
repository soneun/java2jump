package 연습_클래스;

public class CubeTest {
    public static void main(String[] args) {
        //두 정육면체 객체 생성
        Cube a = new Cube(3);
        Cube b = new Cube(5);

        //출력
        System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(),a.surfaceArea());
        System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(),b.surfaceArea());
    }
}

class Cube{
    //필드
    int length;//한변의 길이

    //생성자
    Cube(int length){
        this.length = length;
    }
    //메서드(인스턴스 메서드)-정육면체의 부피 반환
    public int volume(){
        return length*length*length;
    }
    //메서드(인스턴스 메서드)-정육면체의 겉넓이 반환
    public int surfaceArea(){
        return 6*length*length;
    }
}
