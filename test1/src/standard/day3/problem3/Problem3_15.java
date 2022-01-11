package standard.day3.problem3;

public class Problem3_15 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        System.out.println("数値：" + num);

        if (80 <= num) {
            System.out.println("優");
        } else if (70 <= num) {
            System.out.println("良");
        } else if (60 <= num) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }
    }
}
