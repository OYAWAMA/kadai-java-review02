
public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            // iの値を表示。ただし15の倍数はFizzBuzz,3の倍数はFizz,5の倍数はBuzz
            String si = (i % 15 == 0) ? "FizzBuzz" 
                    : (i % 3 == 0) ? "Fizz"
                    : (i % 5 == 0) ? "Buzz" 
                    : Integer.valueOf(i).toString();//intのiをstringのsiに変更

            System.out.println(si);
        }
    }
}
