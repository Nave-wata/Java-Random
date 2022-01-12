package fundamental.problem8;

public class Problem8_8 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 1000) + 1;
        int i;

        System.out.println("数値：" + num);

        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
