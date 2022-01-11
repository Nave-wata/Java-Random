package standard.day4.problem4;

public class Problem4_14 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        int i;

        if (num % 2 == 0) {
            for (i = 0; i < num; i++) {
                System.out.print("★ ");
            }
        } else {
            for (i = 0; i < num; i++) {
                System.out.print("☆ ");
            }
        }
    }
}
