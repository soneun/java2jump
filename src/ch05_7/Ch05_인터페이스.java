package ch05_7;

interface Predator{
//추상메서드(구현이 되지 않은 메서드)
    String getFood();
}
class Animal{
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Tiger extends Animal implements Predator {
    public String getFood(){
        return "apple";
    }

}
class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "banana";
    }
}
class ZooKeeper {
     void feed(Predator p){
        System.out.println("먹이주기: " + p.getFood());
    }
}

public class Ch05_인터페이스 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Lion l = new Lion();
        ZooKeeper z = new ZooKeeper();
        z.feed(t);//인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(l);


    }


}
