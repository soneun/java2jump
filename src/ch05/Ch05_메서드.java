package ch05;

class Sample{
    //메서드 입력 매개변수(parameter) a,b
    int sum(int a, int b){
        return a+b;
    }

    void sum2(int a, int b){
        System.out.println(a+"와 "+ b+"의 합은 "+(a+b)+"입니다.");
        System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
    }
    //입력은 없고 문자열 "hi"가 반환됨
    String say(){
        return "hi";
    }

    //입력과 리턴이 모두 없는 메서드
    void hello(){
        System.out.println("헬로우");
    }

    //리턴으로 빠져나오기(메서드에서 리턴을 만나면 종료됨)
    void sayNick(String nick){
        if("바보".equals(nick)){
            return;//종료(아래의 코드는 실행안됨)
        }
        System.out.println("나의 별명은 "+nick+"입니다.");
    }

    //메서드 내에서 선언된 변수의 효력범위
    /*void varTest(int a){
        a++;
    }*/
    int varTest(int a){
        a++;
        return a;
    }
}



public class Ch05_메서드 {

    public static void main(String[] args) {


        Sample s = new Sample();
        //객체.메서드 => 메서드호출 (이 때 전달하는 입력값을 인수(arguments)
        int c = s.sum(3, 4);
        System.out.println(c);

        s.sum2(3,4);
        System.out.println();

        String say = s.say();
        System.out.println(say);

        s.hello();

        s.sayNick("천재");
        s.sayNick("바보");

        int a = 1;
        s.varTest(a);
        System.out.println(a);



    }
}
