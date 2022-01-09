package day5.problem5;

public class Problem5_13 {

    public static void main(String[] args) {
        int data[][] = new int[3][3];
        int max = 0, min = 10;
        int i, j;

        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                data[i][j] = (int) (Math.random() * 9) + 1;

                if (max < data[i][j]) {
                    max = data[i][j];
                }
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
        }

        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n最大値：" + max);
        System.out.println("最小値；" + min);
    }
}
