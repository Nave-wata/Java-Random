package fundamental.day4.problem4;

public class Problem4_16 {

    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + ", ");
            }
            System.out.println();
        }
    }
}
