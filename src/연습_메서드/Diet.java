package 연습_메서드;

public class Diet {
    public static void main(String[] args) {
        //변수 생성
        double w = 43.0;
        double t = 1.54;

        //BMI 계산
        double bmi = calculate(w,t);

        //결과 출력
        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
        System.out.printf("결과: %s입니다.\n", result(bmi));

    }

    public static double calculate(double weight, double tall) {
        return weight / Math.pow(tall,2);
    }

    public static String result(double bmi){
        String result = "";
                if(bmi>=30)
                    return "비만";
                else if (bmi>=25)
                    return "과체중";
                else if(bmi>=18.5)
                    return "정상";
                else
                    return "저체중";

    }
}
