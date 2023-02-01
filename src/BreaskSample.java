
public class BreaskSample {

    public static void main(String[] args) {
        // 検索対象のデータを準備
        int[] targetArray = { 37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };

        // 検索直を指定
        int search = 98;

        // カウンタ変数を宣言
        int i;

        // 配列の全要素を対象に検索
        for (i = 0; i < targetArray.length; i++) {
            if (search == targetArray[i]) {
                break;
            }
        }

        // 検索結果の判定
        if (i >= targetArray.length) {
            System.out.println("対象のデータが見つかりませんでした");
        } else {
            System.out.println("添字" + i + "に対象のデータ"+targetArray[i]+"が見つかりました");
        }
    }
}
