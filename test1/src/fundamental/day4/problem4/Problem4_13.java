package fundamental.day4.problem4;

public class Problem4_13 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        int i;

        if (5 <= num) {
            for (i = 0; i < num; i++) {
                System.out.print("★ ");
            }
        } else {
            System.out.print("発生した数値：" + num);
        }
    }
}
