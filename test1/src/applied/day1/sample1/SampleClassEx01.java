package applied.day1.sample1;

public class SampleClassEx01 {
    private int value = 0;
    private static int num = 0;

    // コンストラクタ1 引数あり
    public SampleClassEx01(int value) {
        this.value = value;
        num++;
    }

    // コンストラクタ2 引数無し
    public SampleClassEx01() {
        this(100); // 引数付きコンストラクタを呼び出す
    }

    // インスタンスの数を取得
    public static int getNumberOfInstance() {
        return num;
    }

    // インスタンスフィールドを取得
    public int getValue() {
        return this.value;
    }
}
