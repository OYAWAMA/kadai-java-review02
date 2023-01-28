
public class Clock {

    public static void main(String[] args) {
        // int型3つの引数を持つElapsedtimeメソッドを呼び出す
        int result = ElapsedTime(18, 30, 45);
        System.out.println("経過時間は" + result + "秒です");

    }

    public static int ElapsedTime(int hours, int minutes, int seconds) {
        int result = hours * 60 * 60 + minutes * 60 + seconds;
        return result;
    }
}
