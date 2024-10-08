package 연습_메서드;

public class NewLine {
    public static void main(String[] args) {

        System.out.println("라인1");
        threeLines();
        System.out.println("라인2");
    }

    private static void threeLines() {
        oneLine();
        oneLine();
        oneLine();

    }
    private static void oneLine() {
        System.out.println();//한줄띄움
    }


}
