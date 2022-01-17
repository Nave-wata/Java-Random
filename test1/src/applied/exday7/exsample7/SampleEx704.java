package applied.exday7.exsample7;

public class SampleEx704 {
    public static void main(String[] args) {
        try {
            throw new SampleException("自作の例外のサンプル"); // 故意に例外を発生させる
        } catch (SampleException e) {
            e.printStackTrace();
        }
    }
}
