
public class Review01 {

    public static void main(String[] args) {
        int PriceWithoutTax = 1500;//税抜き価格
        int TaxAmount = tax(PriceWithoutTax);//税額をtaxメソッドから受け取って代入
        int PriceIncludeTax = PriceWithoutTax + TaxAmount;//税込み価格、税抜価格と税額の加算で計算し代入
        System.out.println(PriceWithoutTax + "円の商品の税込み価格は" + PriceIncludeTax + "円（消費税は"+TaxAmount+ "円）です。");
    }

    // int型引数のpriceをうけとるtaxメソッド、戻り値あり
    public static int tax(int price) {
        int TaxRate = 10;//税率

        // 戻り値を税込み価格にする場合
        // int result = price * (100 + TaxRate) / 100;

        // 消費税額を計算する
        int result = price * TaxRate / 100;
        return result;
    }
}
