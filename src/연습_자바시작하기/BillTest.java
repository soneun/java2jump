package 연습_자바시작하기;

public class BillTest {
    public static void main(String[] args) {

        int price = 152365;

        //장수 계산
        int oman = price / 50000;
        int man = price % 50000/10000;
        int ochun = price % 50000/5000;
        int chun = price % 50000/1000 ;

        //할인 금액 계산
        int discount = price % 50000 % 1000;
        System.out.println(discount);

        //총 지폐 수 계산
        int totalCnt = oman + man + ochun + chun;

        System.out.printf("5만원 x %d\n",oman);
        System.out.printf("1만원 x %d\n",man);
        System.out.printf("5천원 x %d\n",ochun);
        System.out.printf("1천원 x %d\n",chun);
        System.out.printf("--------------\n");
        System.out.printf("총 장수: %d장\n",totalCnt);
        System.out.printf("금액: %d원\n", price-discount);
        System.out.printf("할인: %d원\n", discount);

    }
}
