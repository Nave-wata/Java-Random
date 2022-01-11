package fundamental.problem8;

public class Problem8_5 {

    public static void main(String[] args) {
        int i, tmp1, tmp2;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            } else {
                tmp1 = i / 10;
                tmp2 = i % 10;
                if (tmp1 == 3 || tmp2 == 3) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
