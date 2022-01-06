package day3;

public class Problem3_4 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        if (num <= 10 || 90 <= num) {
            System.out.println("10以下か，90以上の値です．");
        } else {
            System.out.println("それ以外の値です．");
        }
    }
}
