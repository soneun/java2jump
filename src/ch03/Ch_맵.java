package ch03;

import java.util.HashMap;

public class Ch_맵 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        //맵은 추가를 put으로 함
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("apple", "사과");

        //자료를 가져올 때 get(키)
        System.out.println(map.get("people"));

        //containsKey 맵에 해당 key가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("baseball"));

        //삭제는 remove, (키)
       System.out.println(map.remove("people"));
        //System.out.println(map.get("people")); => null값

        //size : 갯수
        System.out.println(map.size());

        //keySet: 맵의 모든 key를 모아서 리턴
        System.out.println(map.keySet());

        //values: 맵의 모든 value 값들만 모아서 리턴
        System.out.println(map.values());

        System.out.println(map.entrySet());




    }
}
