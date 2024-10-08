package 연습_메서드;

public class ProgrammingGrades {
    public static void main(String[] args) {
        //변수 생성
        int score1 = 96;
        int score2 = 85;
        int score3 = 76;

        //결과 출력
        System.out.printf("%d점 -> %s\n", score1, grade(score1));
        System.out.printf("%d점 -> %s\n", score2, grade(score1));
        System.out.printf("%d점 -> %s\n", score3, grade(score3));

    }

    public static String grade(int score) {
        if(score >= 95)
            return "A+";
        else if(score >= 90)
            return "A0";
        else if(score >= 80)
            return "B+";
        else if(score >= 70)
            return "B0";
        else
            return "C+";
    }
}
