package fundamental.day3.problem3;

public class Problem3_8 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;

        System.out.println("数値：" + num);

        if (num != 1) {
            System.out.println("1以外の数値です．");
        } else {
            System.out.println("1です");
        }
    }
}
