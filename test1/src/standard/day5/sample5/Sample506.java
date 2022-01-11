package standard.day5.sample5;

public class Sample506 {

    public static void main(String[] args) {
        int a[][] = { { 0, 1 }, { 2 }, { 3, 4, 5, 6 } };
        int m, n;

        for (m = 0; m < a.length; m++) {
            for (n = 0; n < a[m].length; n++) {
                System.out.print(a[m][n] + " ");
            }
            System.out.println();
        }
    }
}
