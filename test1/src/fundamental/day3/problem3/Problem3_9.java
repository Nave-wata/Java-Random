package fundamental.day3.problem3;

public class Problem3_9 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        System.out.println("数値：" + num);

        if (num < 50) {
            System.out.println("50未満の値です．");
        } else {
            System.out.println("50以上の値です．");
        }
    }
}
