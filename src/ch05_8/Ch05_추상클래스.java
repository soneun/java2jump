package ch05_8;
//추상클래스 abstract 키워드를 클래스 앞에 적음
abstract class Animal{
    //필드변수
    int a = 0;
    String k = "동물";

    //추상 메서드
    public abstract void color();
    protected abstract void height();

    //일반 메서드
    public void printName(String name){
        System.out.println(name);
    }
}
//추상클래스를 상속받은 클래스는 추상메서드를 구현해야함(에러남)
class Cat extends Animal{
    @Override
    public void color() {
        System.out.println("고양이 색");
    }

    @Override
    protected void height() {
        System.out.println("고양이 키");

    }

}

public class Ch05_추상클래스 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.color();
        c.height();
        c.printName("고양이");



    }
}
