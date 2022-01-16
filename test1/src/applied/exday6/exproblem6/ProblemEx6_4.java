package applied.exday6.exproblem6;

import java.io.*;
import java.util.*;

public class ProblemEx6_4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashSet<String> hs = new HashSet<String>();

        System.out.print("英単語を入力：");
        String buf = br.readLine();
        String num[] = buf.split("");
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            hs.add(num[i]);
        }

        for (String d : hs) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
