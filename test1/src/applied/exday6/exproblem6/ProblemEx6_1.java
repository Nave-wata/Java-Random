package applied.exday6.exproblem6;

import java.io.*;
import java.util.*;

public class ProblemEx6_1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("cat", "猫");
        hm.put("dog", "犬");
        hm.put("bird", "鳥");
        hm.put("tiger", "トラ");

        System.out.print("英語で動物の名前を入力して下さい：");
        String buf = br.readLine();

        if (hm.containsKey(buf)) {
            System.out.println("「" + hm.get(buf) + "」" + "です．");
        } else {
            System.out.println("対応するデータは登録されていません．");
        }

    }
}
