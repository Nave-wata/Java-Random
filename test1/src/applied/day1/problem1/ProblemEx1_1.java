package applied.day1.problem1;

public class ProblemEx1_1 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int result = add(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " = " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
