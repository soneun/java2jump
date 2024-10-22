package ch07_4;

import java.io.*;

public class Ch07_예외처리 {
    public static void main(String[] args) throws IOException {
        //파일처리 예외처리
        BufferedReader br =null;
        //파일 읽을 수 없을 경우 예외처리
        try {
            br = new BufferedReader(new FileReader("없는파일.txt"));
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일 못찾음 에러발생" + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("파일 읽기 또는 닫기 예외 발생" + e.getMessage());
        }

        //산술에 문제(실행중 발생함)
        try {
            int c = 4/0;//예외발생코드
        } catch (ArithmeticException e) {
            System.out.println("수학예외 0으로 나누는 에러발생!" + e.getMessage());
        }finally{
            System.out.println("에러 발생 하던 안하던 무조건 실행!");
        }
        //배열의 인덱스 번호가 틀림(실행중 발생함)
        try{
            int[]a = {1,2,3};
            System.out.println(a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열범위를 넘어가는 에러발생!" + e.getMessage());
        }finally{
            System.out.println("에러 발생 하던 안하던 무조건 실행!");
        }


        System.out.println("프로그램 종료!");

    }
}
