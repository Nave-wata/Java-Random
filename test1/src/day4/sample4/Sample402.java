package day4.sample4;

public class Sample402 {

    public static void main(String[] args) {
        // forの2重ループ
        int i, j, k;

        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= 3; j++) {
                k = i + j;
                System.out.print(i + " + " + j + " = " + k + ", ");
            }
            System.out.println();
        }
    }
}
