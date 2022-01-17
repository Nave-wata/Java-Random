package applied.exday7.exproblem7;

public class ProblemEx7_1 {
    public static void main(String[] args) {
        int a[] = { 0, 1, 2 };

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("a[" + i + "] = " + a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        }
    }
}
