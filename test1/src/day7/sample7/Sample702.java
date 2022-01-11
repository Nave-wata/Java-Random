package day7.sample7;

public class Sample702 {

    public static void main(String[] args) {
        // 引数付きコンストラクタの呼び出し
        SampleClass03 s = new SampleClass03("HelloWorld!");

        // numberのセッターで値を設定
        s.setNumber(100);

        // ゲッターで値を呼び出す
        System.out.println(s.getNumber());
        System.out.println(s.getStr());
    }
}
