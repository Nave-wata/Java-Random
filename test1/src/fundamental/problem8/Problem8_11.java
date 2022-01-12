package fundamental.problem8;

public class Problem8_11 {

    public static void main(String[] args) {
        VariousMethod vm = new VariousMethod();
        final int SIZE = 10, RANDOM_SIZE = 10;
        int data1[] = new int[SIZE];
        int data2[] = new int[SIZE];
        int and_d[] = new int[RANDOM_SIZE];
        int or_d[] = new int[RANDOM_SIZE];
        int i, j, k;

        for (i = 0; i < SIZE; i++) {
            data1[i] = (int) (Math.random() * RANDOM_SIZE) + 1;
            data2[i] = (int) (Math.random() * RANDOM_SIZE) + 1;
        }

        for (i = 0; i < RANDOM_SIZE; i++) {
            for (j = 0; j < SIZE; j++) {
                for (k = 0; k < SIZE; k++) {
                    if (data1[j] == (i + 1) && data2[k] == (i + 1)) {
                        and_d[i] = 1;
                    }
                    if (data1[j] == (i + 1) || data2[k] == (i + 1)) {
                        or_d[i] = 1;
                    }
                }
            }
        }

        System.out.print("配列1：");
        vm.printData(data1, SIZE);

        System.out.print("\n配列2：");
        vm.printData(data2, SIZE);

        System.out.print("\nAND：");
        vm.printRandom(and_d, RANDOM_SIZE);

        System.out.print("\nOR：");
        vm.printRandom(or_d, RANDOM_SIZE);

        System.out.println();
    }
}
