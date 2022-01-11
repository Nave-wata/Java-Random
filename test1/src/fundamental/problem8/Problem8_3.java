package fundamental.problem8;

import java.util.Scanner;

public class Problem8_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 1;
        int i;

        int num = scanner.nextInt();
        scanner.close();

        for (i = 1; i < num; i++) {
            ans *= i;
        }
        System.out.println(num + "! = " + ans);
    }
}
