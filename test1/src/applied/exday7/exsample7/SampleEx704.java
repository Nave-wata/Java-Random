package applied.exday7.exsample7;

public class SampleEx704 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    throw new SampleException("i = " + i + "例外風に"); // 故意に例外を発生させる
                } else {
                    System.out.println(i);
                }
            }
        } catch (SampleException e) {
            e.printStackTrace(); // この行書かなくてもi = 5以降は出力されない(エラーはでない)
        }
    }
}
