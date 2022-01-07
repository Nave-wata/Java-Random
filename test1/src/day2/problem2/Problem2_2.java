package day2.problem2;

public class Problem2_2 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        a = a + 2; // aに2を加える
        b = b - 1; // bから1を引く
        c = c * 3; // cに3をかける
        d = d / 2; // dを2で割る
        e = e % 2; // eを2で割った余り

        System.out.println("a + 2 = " + a);
        System.out.println("b - 1 = " + b);
        System.out.println("c * 3 = " + c);
        System.out.println("d / 2 = " + d);
        System.out.println("e % 2 = " + e);
    }
}
