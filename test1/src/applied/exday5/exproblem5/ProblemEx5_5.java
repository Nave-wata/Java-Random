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

        for (i = ary.size() - 1; 0 <= i; i--) {
            if (5 <= ary.get(i).length()) {
                ary.remove(i);
            } else {
                // do nothing
            }
        }

        for (String s : ary) {
            System.out.print(s + " ");
        }
    }
}
