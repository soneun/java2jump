package 연습_자바API;

import java.util.HashMap;

public class Marathon {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"병주","병헌","승헌"},new String[]{"병헌","승헌"}));
        System.out.println(solution(new String[]{"병주","병헌","승헌","송군"},new String[]{"병주","병헌","승헌"}));
        System.out.println(solution(new String[]{"병주","병헌","승헌","병헌"},new String[]{"병주","병헌","승헌"}));

    }
    public static String solution(String[]participant, String[]completion){
        String answer = "";
        //해시맵 hm 생성. 참가자 이름과 함께 인원수를 적을 수 있도록 자료형 만들기
        HashMap<String, Integer> hm = new HashMap<>();

        //참가자 배열에서 이름을 하나씩 꺼내어 이름과 숫자 1을 해시맵에 추가
        //이때 중복되는 이름은 중복되는만큼 수 더하기
        for (String name : participant) {
            if(hm.get(name) == null){//해시맵에 이름이 없다면
                hm.put(name, 1);//이름과 함께 1 추가
            }else{
                int value = hm.get(name)+1;//해시맵의 그 이름에 해당하는 값을 가져와 +1한다.
                hm.put(name, value);//이름이 중복될 경우 업데이트
            }

        }
        for (String name : completion) {
            int value = hm.get(name)-1;
           hm.put(name,value);//마라톤 완주자 이름은 해시맵에서 -1해줌
        }
        for (String name : hm.keySet()) {//해시맵 요소를 전체 반복
            if(hm.get(name) == 1){//이름에 해당하는 값이 1이면 리턴값으로 한다.
                answer = name;
            }

        }
        return answer;
    }
}
