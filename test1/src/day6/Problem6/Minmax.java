package day6.Problem6;

public class Minmax {

    // 最大値の取得
    public int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public int min(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        }
        return n2;
    }
}
