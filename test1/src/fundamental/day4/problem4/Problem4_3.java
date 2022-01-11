package fundamental.day4.problem4;

public class Problem4_3 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1;
        int i = 0;

        System.out.println("数：" + num);

        do {
            System.out.print("■ ");
            i++;
        } while (i < num);
    }
}
