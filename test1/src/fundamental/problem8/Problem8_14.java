package fundamental.problem8;

public class Problem8_14 {

    public static void main(String[] args) {
        final int SIZE = 10000;
        int data[] = new int[SIZE];
        int sum1 = 0, sum2 = 0, tmp = 0;
        int i, j;

        for (i = 1; i <= SIZE; i++) {
            if (data[i - 1] == 0 && tmp != i) {
                for (j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum1 += j;
                    }
                }
                for (j = 1; j < sum1; j++) {
                    if (sum1 % j == 0) {
                        sum2 += j;
                    }
                }

                if (sum2 == i && sum1 != i) {
                    System.out.println(i + " と " + sum1);
                    tmp = sum1;
                }
            }
            sum1 = 0;
            sum2 = 0;
        }
    }
}
