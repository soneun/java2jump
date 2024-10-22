package 연습_상속;

public class VariousFriend {
    public static void main(String[] args) {
        //객체 생성
        Artist kim = new Artist("뮤지션 김씨");
        Architect lee = new Architect("건축가 이씨");
        Developer park = new Developer("개발자 박씨");
        Lawyer choi = new Lawyer("변호사 최씨");

        //그룹화: 인터페이스 기준
        Friend[] friends = new Friend[] {kim, lee, park, choi};
        for (Friend f : friends) {
            f.dearFriend();
        }
    }
}
interface Friend{
    void dearFriend();
}
class Artist implements Friend{
    private String name;
    Artist(String name){
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.println(name + "-> 칭구아이가");


    }
}
class Architect implements Friend{
    private String name;
    Architect(String name){
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.println(name + "-> 칭구아이가");


    }
}
class Developer implements Friend{
    private String name;
    Developer(String name){
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.println(name + "-> 칭구아이가");

    }
}
class Lawyer implements Friend{
    private String name;
    Lawyer(String name){
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.println(name + "-> 칭구아이가");

    }
}