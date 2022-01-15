package applied.exday5.exproblem5;

import java.util.*;

public class ProblemEx5_7 {
    public static void main(String[] args) {
        ArrayList<Integer> arys = new ArrayList<Integer>();
        int num = (int) (Math.random() * 11) + 1 - 1;
        int cnt_ary[] = new int[11];
        int i, j;

        System.out.println("0 ~ 10の値を出力：" + num + "\n");

        while (0 != num) {
            arys.add(num);

            cnt_ary[num] += 1;
            for (i = 0; i < cnt_ary.length; i++) {
                if (0 < cnt_ary[i]) {
                    for (j = 0; j < cnt_ary[i]; j++) {
                        System.out.print(i + " ");
                    }
                }
            }

            System.out.println("\n");
            num = (int) (Math.random() * 11) + 1 - 1;
            System.out.println("0 ~ 10の値を出力：" + num + "\n");
        }
    }
}
