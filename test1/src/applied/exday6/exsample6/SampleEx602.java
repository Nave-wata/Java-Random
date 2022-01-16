package applied.exday6.exsample6;

import java.util.*;

public class SampleEx602 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("山田太郎");
        hs.add("山田太郎");
        hs.add("太田美代子");
        hs.add("斉藤五郎");
        hs.add("斉藤五郎");

        for (String s : hs) {
            System.out.println(s);
        }
    }
}
