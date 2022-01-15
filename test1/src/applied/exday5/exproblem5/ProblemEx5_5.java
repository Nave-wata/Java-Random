package applied.exday5.exproblem5;

import java.io.*;
import java.util.*;

public class ProblemEx5_5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> ary = new ArrayList<String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i;

        System.out.print("文字列を入力：");
        String buf = br.readLine();

        while (buf != "") {
            ary.add(buf);
            System.out.print("文字列を入力：");
            buf = br.readLine(); // ここで改行入る
        }
        System.out.println(ary.size());
        System.out.println(ary.get(0).length()); // 文字数取得
        for (i = 0; i < ary.size(); i++) {
            if (5 <= ary.get(i).length()) {
                ary.remove(i);
                System.out.print(ary.get(i).length());
            }
        }

        for (String s : ary) {
            System.out.print(s + " ");
        }
    }
}
