package applied.exday5.exproblem5;

import java.io.*;
import java.util.*;

public class ProblemEx5_4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> ary = new ArrayList<String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("文字列を入力：");
        String buf = br.readLine();

        while (buf != "") {
            ary.add(buf);
            System.out.print("文字列を入力：");
            buf = br.readLine(); // ここで改行入る
        }

        for (String s : ary) {
            System.out.print(s + " ");
        }
    }
}
