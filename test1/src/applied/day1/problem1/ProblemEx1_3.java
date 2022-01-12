package applied.day1.problem1;

public class ProblemEx1_3 {

    public static void main(String[] args) {
        int y = (int) (Math.random() * 10) + 1;
        int x = (int) (Math.random() * 10) + 1;

        System.out.println("たて：" + y);
        System.out.println("よこ：" + x);

        square(y, x);
    }

    static void square(int y, int x) {
        int i, j;

        for (i = 0; i < y; i++) {
            for (j = 0; j < x; j++) {
                System.out.print("■ ");
            }
            System.out.println();
        }
    }
}
