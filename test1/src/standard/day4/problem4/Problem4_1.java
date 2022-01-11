package standard.day4.problem4;

public class Problem4_1 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        int i;

        System.out.println("数：" + num);

        for (i = 0; i < num; i++) {
            System.out.print("■ ");
        }
    }
}
