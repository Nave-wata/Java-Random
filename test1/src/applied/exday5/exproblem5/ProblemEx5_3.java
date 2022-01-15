package applied.exday5.exproblem5;

import java.util.*;

public class ProblemEx5_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arys = new ArrayList<Integer>();
        int num = (int) (Math.random() * 101) + 1 - 1;
        int i;
        boolean flag;

        while (0 != num) {
            arys.add(num);
            num = (int) (Math.random() * 101) + 1 - 1;
            System.out.println("0 ~ 10の値を出力：" + num);
        }

        for (i = 0; i < 10; i++) {
            flag = true;
            System.out.print("一の位が" + i + "：");
            for (Integer j : arys) {
                if (j % 10 == i) {
                    System.out.print(j + " ");
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("なし");
            } else {
                System.out.println();
            }
        }
    }
}
