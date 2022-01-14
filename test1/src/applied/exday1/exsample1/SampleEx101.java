package applied.exday1.exsample1;

public class SampleEx101 {

    public static void main(String[] args) {
        SampleClassEx01 s1, s2;

        System.out.println("インスタンス数：" + SampleClassEx01.getNumberOfInstance());

        // インスタンスを生成する
        s1 = new SampleClassEx01(50); // コンストラクタ1を呼び出す
        s2 = new SampleClassEx01(); // コンストラクタ2を呼び出す

        // 値を取得して表示
        System.out.println(s1.getValue());
        System.out.println(s2.getValue());

        // インスタンスの数を表示
        System.out.println("インスタンス数：" + SampleClassEx01.getNumberOfInstance());
    }
}
