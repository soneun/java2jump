package 연습_상속;

public class ElvesTest {
    public static void main(String[] args) {
        //객체 생성
        Elf elf = new Elf("티란데", 100);
        HighElf high = new HighElf("말퓨리온", 160,100);
        Elford lord = new Elford("마이에브",230,140,100);

        //객체 배열 생성
        Elf[] elves = {elf,high,lord};

        //모든 객체 정보 출력
        for(int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString());
        }
        //forEach문
        for (Elf e : elves) {
            System.out.println(e.toString());
        }


    }
}
class Elf{
    String name;
    int hp;

    Elf(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    //toString 메소드는 객체의 정보를 보여줌, 메서드 생략
    public String toString(){
        return String.format("[엘프] Name: %s,HP: %d", name, hp);
    }
}

class HighElf extends Elf{
    int mp;
    //생성자 상속시 부모 객체를 먼저 만든다
    HighElf(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
    }
    public String toString(){
        return String.format("[하이엘프] Name: %s,HP: %d, MP: %d", name, hp, mp);
    }
}

class Elford extends HighElf{
    int shield;

    Elford(String name, int hp, int mp, int shield){
        super(name, hp, mp);
        this.shield = shield;
    }
    public String toString(){
        return String.format("[엘프로드] Name: %s,HP: %d, MP: %d, SH: %d", name, hp, mp, shield);
    }
}
