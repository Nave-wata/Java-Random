package applied.exday1.exproblem1;

public class ProblemEx1_1 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int ans_add = add(a, b);
        int ans_sub = sub(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " = " + ans_add);
        System.out.println(a + " - " + b + " = " + ans_sub);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }
}
