package day4.problem4;

public class Problem4_12 {

    public static void main(String[] args) {
        int i, num;
        int min = 100;

        for (i = 0; i < 5; i++) {
            num = (int) (Math.random() * 100) + 1;

            System.out.println(num);

            if (num < min) {
                min = num;
            }
        }
        System.out.println("最小値：" + min);
    }
}
