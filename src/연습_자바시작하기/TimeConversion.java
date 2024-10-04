package 연습_자바시작하기;

public class TimeConversion {
    public static void main(String[] args) {

        //변수 생성
        int totalSec = 7582;
        int hour = totalSec / 3600;
        int min = totalSec % 3600 / 60;
        int sec = totalSec % 60;

        System.out.println(hour + "시간" + min + "분" + sec + "초");
    }
}
