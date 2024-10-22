package 연습_상속;

public class WizardTest {
    public static void main(String[] args) {
        //객체 생성
        GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);

        //상태 출력
        System.out.println(gandalf.toString());

        //에너지볼트
        gandalf.energeVolt();
    }
}
class Novice{
    //필드
    protected String name;
    protected int hp;

    //생성자
    Novice(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    //toString
    public String toString(){
        return String.format("[Novice] %s(HP: %d)", this.name, this.hp);
    }
}
class Wizard extends Novice{
    //필드
    protected int mp;

    //생성자
    Wizard(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
    }
    //에너지볼트
    public void energeVolt(){
        System.out.printf("%s의 에너지볼트!\n", this.name);
    }
}
class GreatWizard extends Wizard{
    //필드 생성
    protected int shield;
    GreatWizard(String name, int hp, int mp, int shield){
        super(name, hp, mp);
        this.shield = shield;
    }
    public String toString(){
        return String.format("[대마법사] %s(HP: %d, MP: %d, SHIELD: %d)", this.name, this.hp, this.mp, this.shield);
    }
    public void energeVolt(){
        System.out.printf("%s의 에너지볼트!(대마법사 버프로 데미지+30추가)", this.name);
    }

}