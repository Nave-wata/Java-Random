package day4.problem4;

public class Problem4_9 {

    public static void main(String[] args) {
        int num;

        while (true) {
            num = (int) (Math.random() * 100) + 1;

            System.out.println(num);

            if (num % 10 == 0) {
                break;
            }
        }
        System.out.println("終了します．");
    }
}