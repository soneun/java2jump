package 연습_클래스;

public class HeroTest {
    public static void main(String[] args) {

        //두 싸움꾼 객체 생성
        Hero arthas = new Hero("아서스");
        Hero leona = new Hero("레오나");

        //격투 시작
        Hero.battle (arthas, leona);

    }
}

class Hero{
    String name;
    int hp;

    Hero(String str){
        name = str;
        hp = 30;
    }

    //메서드(인스턴스 메서드)
    public void punch(Hero enemy){
        int random = (int)(Math.random()*10)+1;
        enemy.hp -= random;




    }
    //메서드(클래스 메서드)
    public static void battle(Hero a, Hero b){

        while(a.hp>0 && b.hp>0){
            a.punch(b);
            System.out.printf("[%s]의 펀치%n",a.name);
            System.out.printf("%s: %d/30%n",b.name,b.hp);

            b.punch(a);
            System.out.printf("[%s]의 펀치%n",b.name);
            System.out.printf("%s: %d/30%n",a.name,a.hp);



        }
    }
}
