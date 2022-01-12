package applied.day1.sample1;

public class SampleEx102 {

    public SampleEx102() {
        System.out.println("コンストラクタ");
    }

    public void foo() {
        System.out.println("インスタンスメソッド");
    }

    public static void bar() {
        System.out.println("静的メソッド");
    }

    public static void main(String[] args) {
        SampleEx102 i = new SampleEx102();

        i.foo();
        i.bar(); // インスタンスからも，静的メソッドを呼べる (非推奨...？)
        SampleEx102.bar(); // クラス名からの呼び出し
        bar(); // 同じクラス内なら，クラス名なしでも呼び出せる

        System.gc(); // ガベージコレクタの呼び出し
    }
}
