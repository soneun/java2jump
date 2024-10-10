package 연습_클래스;

public class MinerTest {
    public static void main(String[] args) {

        //두 갱부 객체를 생성하세요
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

        //코인을 채굴하세요
        malon.coins = 2;
        gloria.coins = 1;
        malon.mine();
        gloria.mine();


        //객체 정보 출력
        System.out.println(malon);
        System.out.println(gloria);
    }
}

class Miner{
    String name;
    int coins;

    Miner(String str){
        name = str;
        coins = 0;
    }
    //메서드(인스턴스 메서드)- 객체의 정보를 문자열로 반환
    public String toString(){
        return String.format("Miner {name: %s, coins: %d}", name, coins);
    }
    //메서드(인스턴스 메서드)-코인 채굴
    public void mine(){
        coins +=1;
    }
}
