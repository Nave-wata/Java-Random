package standard.day5.problem5;

public class Problem5_1 {

    public static void main(String[] args) {
        int a[] = new int[7];
        int i;

        for (i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
        }

        for (i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = " + a[i] + ", ");
        }

    }
}
