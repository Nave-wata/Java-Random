package day4.problem4;

public class Problem4_11 {

    public static void main(String[] args) {
        int i, num;
        int max = 0;

        for (i = 0; i < 5; i++) {
            num = (int) (Math.random() * 100) + 1;

            System.out.println(num);

            if (num > max) {
                max = num;
            }
        }
        System.out.println("最大値：" + max);
    }
}
