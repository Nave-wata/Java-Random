package standard.day4.problem4;

public class Problem4_15 {

    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
