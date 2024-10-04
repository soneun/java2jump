package ch03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {

        //문자열을 추가하거나 변경할 때 사용하는 자료형
       StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("점프 to 자바");

        System.out.println(sb);

        //sb 대신 문자열로 해보자.(""문자열(리터럴)을 만들면 수정할 수 없다.)
        String result = "";
        result += "hello";//result = result + "hello"
        result += " ";
        result += "점프 to 자바";
        System.out.println(result);

        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0, "hello ");//0번쨰 인덱스에 추가됨
        System.out.println(sb2);

        //substring 문자열 잘라내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb3.substring(0,4));//시작번호, 끝번호-1까지 잘라냄



    }
}
