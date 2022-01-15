package applied.exday5.exproblem5;

import java.util.*;

public class ProblemEx5_3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int cnt_num[] = new int[10];
        int num = (int) (Math.random() * 100) + 1 - 1;
        int i;

        while (0 != num) {
            array.add(num);
            i = num % 10;
            cnt_num[i] += 1;
            num = (int) (Math.random() * 100) + 1 - 1;
            System.out.println("0 ~ 10の値を出力：" + num);
        }

        for (i = 0; i < cnt_num.length; i++) {
            if (cnt_num[i] != 0) {
                System.out.println("一の位が" + i + "：" + cnt_num[i]);
            } else {
                System.out.println("一の位が" + i + "：" + "なし");
            }
        }
    }
}
