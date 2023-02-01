
public class IfSample2 {

    public static void main(String[] args) {
        int score = 70;// 成績

        // scoreが60未満でない ならば
        String result = (!(score<60))?"合格です":"赤点です";
        System.out.println(result);
        /*if (!(score < 60)) {
            // 合格です!と表示
            System.out.println("合格です!");
        } else {
            // 赤点で…と表示
            System.out.println("赤点です。。。");
        }*/

    }

}
