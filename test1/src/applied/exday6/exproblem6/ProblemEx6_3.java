package applied.exday6.exproblem6;

import java.util.*;

public class ProblemEx6_3 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int num;

        System.out.print("乱数：");
        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 10) + 1;
            hs.add(num);

            System.out.print(num + " ");
        }

        System.out.print("\n出現した数：");
        for (Integer d : hs) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
