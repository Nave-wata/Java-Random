package applied.exday5.exproblem5;

import java.util.*;

public class ProblemEx5_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num = (int) (Math.random() * 10) + 1 - 1;
        int i;

        while (0 != num) {
            array.add(num);
            num = (int) (Math.random() * 10) + 1 - 1;
            System.out.println("0 ~ 10の値を出力：" + num);
        }

        for (i = array.size() - 1; 0 <= i; i--) {
            int d = array.get(i);
            System.out.print(d + " ");
        }
    }
}
