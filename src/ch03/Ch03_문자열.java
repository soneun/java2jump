package ch03;

public class Ch03_문자열 {
    public static void main(String[] args) {

        // 숫자(int,double), 문자(char), 불린(boolean) => 기초자료형
        //문자열은 기초자료형이 아님
       // String a = "Happy Java";
        String a = new String("Happy Java");
        //String b = "a";
        String b = new String("a");
        String c = "123";
        //문자열은 리터럴 표기방식(값을 바로 표기하는 방식)을 사용하는 것이 좋다.

        //내장 메서드
        a = "hello";
        b = "java";
        c = "hello";
        //문자열 비교 메서드 equals
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        //indexOf: 특정 문자열이 시작되는 위치(인덱스 값)
        a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        //자바에서 숫자를 0부터 셈

        //contains: 특정 문자열이 포함되어 있는지 여부를 리턴
        a = "Hello Java";
        System.out.println(a.contains("Java"));

        //charAt: 문장열에서 특정 위치의 만자를 리턴
        System.out.println(a.charAt(6));

        //replaceAll: 특정 문자열을 다른 문자열로 바꿀때
        System.out.println(a.replaceAll("Java","world!"));

        //subString: 문자열에서 특정 문자열을 뽑아낼 떄 사용
        System.out.println(a.substring(0,4));

        //toUpperCase: 문자열을 대문자로 변환
        System.out.println(a.toUpperCase());

        //split: 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        a = "a:b:c:d";
        String[] result = a.split(":");
        System.out.println(result);

        //문자열 포매팅(문자열 안에 특정 타입값을 대입)
        System.out.println(String.format("나는 사과를 %s개 먹었다.", "다섯"));
        //숫자를 입력
        System.out.println(String.format("나는 사과를 %d개 먹었다.", 5));
        //두개 이상 입력
        System.out.println(String.format("나는 사과를 %d개 먹고 아파서 %s일 약을 먹었다.", 5, "삼"));

    }
}
