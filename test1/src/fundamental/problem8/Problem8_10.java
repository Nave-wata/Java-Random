package fundamental.problem8;

class FinalVariable {
    public static final int SIZE = 40;
}

public class Problem8_10 {

    public static void main(String[] args) {
        final int SIZE = 40;
        int data[] = new int[SIZE];
        int i;

        data[0] = 1;
        data[1] = 1;

        for (i = 2; i < SIZE; i++) {
            data[i] = data[i - 2] + data[i - 1];
        }

        for (i = 0; i < SIZE; i++) {
            if (data[i] < 40) {
                System.out.print(data[i] + ", ");
            }
        }
    }
}
