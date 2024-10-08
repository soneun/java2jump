package 연습_배열과_반복문;

public class Bacteria {
    public static void main(String[] args) {

        //배열 생성
        int[] bacteriaCountLogs = new int[10];

        //개체 수 기록
        writeLog(bacteriaCountLogs);

        //결과 출력
        printLog(bacteriaCountLogs);



    }
    //박테리아의 개체 수를 기록
    public static void writeLog(int[] logs){
        for(int i=0; i<logs.length; i++){
            logs[i] = (int)Math.pow(2,i);
        }

    }
    public static void printLog(int[] arr){
        System.out.printf("[");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d", arr[i]);
            if(i != arr.length-1){
                System.out.printf(",");
            }
        }
        System.out.printf("]");
    }
}
