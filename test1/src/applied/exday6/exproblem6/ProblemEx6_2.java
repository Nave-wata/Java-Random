package applied.exday6.exproblem6;

import java.io.*;
import java.util.*;

public class ProblemEx6_2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String, String> hm = new HashMap<String, String>();
        ArrayList<String> al = new ArrayList<String>();
        boolean flag = true;

        hm.put("0", "〇");
        hm.put("1", "一");
        hm.put("2", "二");
        hm.put("3", "三");
        hm.put("4", "四");
        hm.put("5", "五");
        hm.put("6", "六");
        hm.put("7", "七");
        hm.put("8", "八");
        hm.put("9", "九");

        System.out.print("整数の値を入力して下さい：");
        String buf = br.readLine();
        System.out.println();

        String num[] = buf.split("");
        for (int i = 0; i < num.length; i++) {
            al.add(num[i]);
            if (null == hm.get(num[i])) {
                flag = false;
            }
        }

        if (flag) {
            System.out.print("交換結果：");

            for (int i = 0; i < num.length; i++) {
                if ((num.length - i) % 3 == 0 && i != 0) {
                    System.out.print(",");
                }
                System.out.print(hm.get(al.get(i)));
            }
        } else {
            System.out.print("整数の値を入力して下さい.");
        }
        System.out.println();
    }
}
