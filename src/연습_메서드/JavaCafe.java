package 연습_메서드;

public class JavaCafe {
    public static void main(String[] args) {

        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);

    }
    //시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        double pay = basePay * hours;
        if(basePay<8.00) {
            System.out.println("최저시급에러!");
            return;
        }

        if(hours>60){
            System.out.println("초과 근무시간 에러!");
            return;
        }

        System.out.printf("$%.2f\n", pay);

    }

}
