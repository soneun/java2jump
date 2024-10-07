package ch04;

import java.util.ArrayList;

public class Ch04_IF {
    public static void main(String[] args) {

        /*ctrl +  shift + /여러줄 주석*/
        /*if 문*/

        int money = 2000;

        if(money>=3000) {
            System.out.println("택시를 타고 가라");
        }else{
            System.out.println("걸어가라");
        }

        int money1 = 2000;
        boolean hasCard = true;

        if(money1>=3000 || hasCard){
            System.out.println("택시를 타고 가라");
        }else{
            System.out.println("걸어가라");
        }

        //if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");
        if(pocket.contains("money")){
            System.out.println("택시를 타고 가라");
        }else{
            System.out.println("걸어가라");
        }



    }
}
