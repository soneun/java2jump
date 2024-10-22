package 연습_상속;

import java.util.ArrayList;

interface Sounding{
    public void sound();
}
class Dog implements Sounding{
    public void sound(){
        System.out.println("Dog: 멍멍");
    }
}
class Baby implements Sounding{
    public void sound(){
        System.out.println("Baby: 응애");
    }
}
class Tiger implements Sounding{
    public void sound(){
        System.out.println("Tiger: 어흥");
    }
}
class Robot implements Sounding{
    public void sound(){
        System.out.println("Robot: 삐빕");
    }
}


public class InterfaceReview {
    public static void main(String[] args) {
        //객체생성
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot();

        //ArrayList를 통해 객체 저장
        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        //소리내기
        for (Sounding s : list) {
            s.sound();
        }
        for(int i = 0; i < list.size(); i++){
            list.get(i).sound();
        }



    }
}
