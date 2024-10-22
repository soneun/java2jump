package ch07_3;

class Singleton{
    private static Singleton one;
    //생성자를 private 해서 다른 클래스에서 객체를 못만듦
    private Singleton(){}
    //스테틱 메서드로 객체를 가져오기만 함
    public static Singleton getInstance(){
       if(one == null){
           one = new Singleton();
       }
       return one;//처음에 만든 객체가 리턴됨
    }
}
public class Ch07_싱글턴 {
    public static void main(String[] args) {
        //단 하나의 객체를 생성
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
