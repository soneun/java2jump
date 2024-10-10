package 연습_클래스;

public class CylinerTest {
    public static void main(String[] args) {

        //객체 생성
        Cylinder c = new Cylinder(4,5);

//        //속성값 입력
       c.r = 4;
       c.h = 5;

        //출력
        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());

    }
}

class Cylinder{

    int r;
    int h;

    Cylinder(int r, int h){
        this.r = r;
        this.h = h;
    }
    public double getVolume() {
        return Math.PI * r * r * h;
    }
    public double getArea() {
        return (2*Math.PI*r*r) + (2*Math.PI*r*h);
    }


}
