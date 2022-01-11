package fundamental.problem8;

public class Problem8_4 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 1000) + 1;
        int i = 1;

        System.out.println("num = " + num);

        while ((int) (num / 10) != 0) {
            num /= 10;
            i++;
        }

        System.out.println(i + " 桁");
    }
}
