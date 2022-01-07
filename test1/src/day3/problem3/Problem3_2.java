package day3;

public class Problem3_2 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;

        System.out.println("num = " + num);

        if (num != 1) {
            System.out.println("1ではありません．");
        } else {
            System.out.println("1です．");
        }
    }
}
