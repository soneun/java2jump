package 연습_자바시작하기;

public class SpeedConversion {
    public static void main(String[] args) {

        //속도 = 거리(m) / 시간(s)
        double meter = 100;
        double sec = 18;

        //시속 = 거리(km)/시간(h)
        double sisok = (meter/1000)/(sec/3600);

        System.out.println(sisok + "km/h");

    }
}
