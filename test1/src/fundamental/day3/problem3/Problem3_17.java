package fundamental.day3.problem3;

public class Problem3_17 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        System.out.println("数値：" + num);

        if (num <= 50 && num % 2 == 0) {
            System.out.println("50以下の偶数です．");
        } else if (num % 2 == 0) {
            System.out.println("偶数です．");
        } else if (num <= 50) {
            System.out.println("50以下の値です．");
        }
    }
}
