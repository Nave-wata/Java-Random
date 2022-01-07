package day3.problem3;

public class Problem3_10 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        System.out.println("数値：" + num);

        if (num <= 10 || 90 <= num) {
            System.out.println("10以下か，90以上の値です");
        } else {
            System.out.println("10より大きく，90未満の値です．");
        }
    }
}
