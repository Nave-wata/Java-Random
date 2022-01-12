package fundamental.problem8;

public class VariousMethod {

    public void printData(int array[], int size) {
        int i;

        for (i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }

    public void printRandom(int array[], int size) {
        int i;

        for (i = 0; i < size; i++) {
            if (array[i] == 1) {
                if (i == size - 1) {
                    System.out.print((i + 1));
                    break;
                }
                System.out.print((i + 1) + ", ");
            }
        }
    }
}
