package 연습_배열과_반복문;

public class ThreeCombos {
    public static void main(String[] args) {

        //n을 만드는 3가지 수 출력
        printCombos(10);
    }

    public static void printCombos(int n) {
        int count = 0;
        for(int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    if(i*j*k == n) {
                        System.out.printf("%d = %d x %d x %d\n", n, i ,j, k);
                        count++;
                    }
                }
            }
        }
        System.out.println("=============================");
        System.out.printf("경우의 수 : %d\n",count);
    }
}
