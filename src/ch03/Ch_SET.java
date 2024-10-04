package ch03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Ch_SET {
    public static void main(String[] args) {

        //set은 리스트중에 중복되지 않음, 순서가 없다.
        HashSet<String> set = new HashSet<String>(Arrays.asList("h", "e", "l", "l","o"));
        System.out.println(set);


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        //교집합 구하기
        HashSet<Integer> intersection= new HashSet<>(s1);//s1으로 교집합 생성
        intersection.retainAll(s2);//교집합 수행(s2와 같은 요소만 남음)
         System.out.println(intersection);

         //합집합 구하기
        HashSet<Integer> union = new HashSet<>(s1);//s1과 같음
        union.addAll(s2);
        System.out.println(union);

        //차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);//s1과 같음
        substract.removeAll(s2);
        System.out.println(substract);

        //메소드 add, addAll, remove
        HashSet<String> s3 = new HashSet<>();
        s3.add("Jump");
        s3.add("To");
        s3.add("Java");
        System.out.println(s3);

        HashSet<String> s4 = new HashSet<>();
        s4.addAll(s3);
        s4.addAll(Arrays.asList("And", "Home"));
        System.out.println(s4);

        s4.remove("Home");
        System.out.println(s4);





    }
}
