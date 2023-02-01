
public class Triangle {

    public static void main(String[] args) {
        // 三角形の各辺a,b,cを定義
        int a = 4;
        int b = 4;
        int c = 4;

        if (a == b && b == c) {
            System.out.println("正三角形です");
        } else if (!(a == b) && !(b == c) && !(c == a)) {
            System.out.println("三角形です");
        } else {
            System.out.println("二等辺三角形です");
        }
    }

}
