package standard.day2.sample2;

public class Sample206 {

    public static void main(String[] args) {
        final int NUMBER = 100;
        final String STRING = "Hoge";

        System.out.println(NUMBER);
        System.out.println(STRING);

        // finalが付いた変数は値を変えられない
        // NUMBER = 1;
        // STRING = "Geho";
    }
}
