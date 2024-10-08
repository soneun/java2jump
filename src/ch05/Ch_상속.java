package ch05;

//부모 클래스
class Anima {
    String name;
    void setName(String name) {
        this.name = name;
    }

}
//자식 클래스 (Anima 클래스를 상속)
class Dog extends Anima {
    void sleep(){
        System.out.println(this.name + "zzz");
    }

}

class HouseDog extends Dog {
    @Override
    void sleep() {
        System.out.println(this.name + "zzz in house");
    }
    void sleep(int hour){
        System.out.println(this.name + "zzz in house"+ hour + "hours");
    }
}

public class Ch_상속 {
    public static void main(String[] args) {

        Anima a = new Dog();//상속관계일 때 부모타입으로 선언가능
        //Dog b = new Anima(); 자식타입으로 선언하고 부모객체는 안됨.
        Dog d = new Dog();
        Anima a1 = new Anima();


        d.setName("puppy");
        System.out.println(d.name);
        d.sleep();

        //메서드 오버라이딩: 부모메서드와 똑같은 이름의 메서드를 새로 만듦
        HouseDog h = new HouseDog();
        h.setName("happy");
        h.sleep();

        //메서드 오버로딩: 이름은 같지만 입력변수가 다른 메서드
        h.sleep(3);



    }

}
