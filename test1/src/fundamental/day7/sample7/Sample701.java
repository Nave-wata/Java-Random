package fundamental.day7.sample7;

public class Sample701 {

    public static void main(String[] args) {
        SampleClass02 s = new SampleClass02();

        // method1()は，privateなので外部からはアクセスできない．
        // s.method1();

        // method2()呼び出し
        s.method2();

        // method3()呼び出し
        s.method3();
        // numは，privateフィールドなので，外部からはアクセスできない
        // s.num = 1;
    }
}
