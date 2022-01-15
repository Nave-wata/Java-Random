package applied.exday5.exproblem5;

import java.util.*;

public class ProblemEx5_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num = (int) (Math.random() * 10) + 1 - 1;

        while (0 != num) {
            array.add(num);
            num = (int) (Math.random() * 10) + 1 - 1;
            System.out.println("0 ~ 10の値を出力：" + num);
        }

        System.out.print("偶数：");
        for (Integer i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\n奇数：");
        for (Integer i : array) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
