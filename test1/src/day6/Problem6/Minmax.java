package day6.Problem6;

public class Minmax {

    // 最大値の取得
    public int max(int n1, int n2, int n3) {
        if (n2 < n1 && n3 < n1) {
            return n1;
        }
        if (n3 < n2) {
            return n2;
        }
        return n3;
    }

    public int min(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;
        }
        if (n2 < n3) {
            return n2;
        }
        return n3;
    }
}
