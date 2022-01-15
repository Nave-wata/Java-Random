package applied.exday5.exproblem5;

import java.util.*;

public class ProblemEx5_6 {
    public static void main(String[] args) {
        ArrayList<Integer> arys = new ArrayList<Integer>();
        int num = (int) (Math.random() * 10) + 2 - 1;
        int i;

        System.out.println("0 ~ 10の値を出力：" + num);

        while (0 != num) {
            arys.add(num);
            num = (int) (Math.random() * 10) + 2 - 1;
            System.out.println("0 ~ 10の値を出力：" + num);
        }

        for (i = arys.size() - 1; 0 <= i; i--) {
            if (arys.get(i) == 2) {
                arys.remove(i);
            }
        }

        for (Integer d : arys) {
            System.out.print(d + " ");
        }
    }
}
