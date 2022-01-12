package fundamental.problem8;

public class Problem8_15 {

    public static void main(String[] args) {
        int numbers[] = new int[50];
        int i, j;

        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers.length; j++) {
                if ((i + 1) % (j + 1) == 0) {
                    if (numbers[i] == 0) {
                        numbers[i] = 1;
                    } else {
                        numbers[i] = 0;
                    }
                }
            }
        }
        for (i = 0; i < numbers.length; i++) {
            System.out.println(String.format("No. %2d : %d", i, numbers[i]));
        }
    }
}
