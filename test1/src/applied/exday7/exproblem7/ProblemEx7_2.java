package applied.exday7.exproblem7;

public class ProblemEx7_2 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(i + " / " + j + " = " + i / j + " ");
                }
                System.out.println();
            }
        } catch (ArithmeticException e) {
            System.out.println("0で割り算はできません");
        }
    }
}
