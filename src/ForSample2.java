
public class ForSample2 {

    public static void main(String[] args) {
        // iの直が0から21より小さい間、処理をくりかえす
        for (int i = 0; i < 21; i++) {
            // iの直が2で割り切れるとき
            if (i % 2 == 0) {
                // iの直を表示する
                System.out.println("i=" + i);
            }
        }

    }

}
