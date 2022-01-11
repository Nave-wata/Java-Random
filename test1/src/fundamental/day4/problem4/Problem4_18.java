package fundamental.day4.problem4;

public class Problem4_18 {

    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print("□ ");
                } else {
                    System.out.print("■ ");
                }
            }
            System.out.println();
        }
    }
}
