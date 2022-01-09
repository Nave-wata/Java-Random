package day5.problem5;

public class Problem5_10 {

    public static void main(String[] args) {
        int data[] = new int[7];
        int i, j;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10) + 1;
            System.out.print(data[i] + ", ");
        }

        System.out.println();
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
