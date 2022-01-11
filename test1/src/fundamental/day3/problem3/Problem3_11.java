package fundamental.day3.problem3;

public class Problem3_11 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        System.out.println("数値：" + num);

        if (20 <= num && num < 80) {
            System.out.println("20以上，80未満の値です．");
        } else {
            System.out.println("20未満または，80以上の値です．");
        }
    }
}
