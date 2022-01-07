package day3.sample3;

public class Sample304 {

    public static void main(String[] args) {
        int dice = (int) (Math.random() * 7) + 1; // 1から7までの乱数を発生させる

        System.out.println("サイコロの目：" + dice);

        // 値が，サイコロの目の範囲内かどうかを調べる
        if (1 < dice && dice < 7) {
            // サイコロの目が偶数か，奇数かで処理を分ける
            if (dice == 2 || dice == 4 || dice == 6) {
                System.out.println("丁（チョウ）です．"); // 偶数ならば丁（チョウ）
            } else {
                System.out.println("半（ハン）です．"); // 奇数ならば半（ハン）
            }
        } else {
            System.out.println("範囲外の数値です．");
        }
    }
}