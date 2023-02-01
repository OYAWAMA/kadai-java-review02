
public class IfElseIfSample {

    public static void main(String[] args) {
        int score = 100;// 成績

        if (score >= 60 && score < 80) {
            System.out.println("合格です");
        } else if (score >= 80 && score < 100) {
            System.out.println("よくできました");
        } else if (score == 100) {
            System.out.println("満点です");
        } else {
            System.out.println("赤点です。。補講を行います");
        }

    }

}
