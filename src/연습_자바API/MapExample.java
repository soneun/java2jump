package 연습_자바API;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        //이름을 키로, 이메일을 값으로 담을 해시맵을 만드시오
        HashMap<String,String> emails = new HashMap<String,String>();
        //데이터를 저장하세요
        emails.put("홍팍","sehong@cloudstudying.kr");
        emails.put("나리", "nari@cloudstudying.kr");
        emails.put("정애", "jungae@cloudstudying.kr");

        //해시맵의 크기를 출력하세요
        System.out.printf("emails.size() -> %d\n",emails.size());

        //key 목록 출력
        System.out.println(("\n== key set =="));
        for (String key : emails.keySet()) {
            System.out.println(key);
        }
        //value 목록 출력
        System.out.println("\n== value ==");
        for (String value : emails.values()) {
            System.out.println(value);
        }

    }
}
