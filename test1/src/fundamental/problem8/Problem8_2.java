package fundamental.problem8;

public class Problem8_2 {

    public static void main(String[] args) {
        int a, b, c;
        int cnt = 0;

        for (a = 1; a <= 100; a++) {
            for (b = a; b <= 100; b++) {
                for (c = 1; c <= 100; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + "*" + a + " + " + b + "*" + b + " = " + c + "*" + c);
                        cnt++;
                    }
                }
            }
        }
        System.out.println("数：" + cnt);
    }
}
