package day5.problem5;

public class Problem5_12 {

    public static void main(String[] args) {
        int data[][] = new int[3][3];
        int i, j;

        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                data[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
