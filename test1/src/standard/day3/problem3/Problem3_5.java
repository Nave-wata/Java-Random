package standard.day3.problem3;

public class Problem3_5 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        System.out.println("num: " + num);

        if (20 <= num && num <= 80) {
            System.out.println("20以上，80未満です");
        } else {
            System.out.println("それ以外の値です");
        }
    }
}
