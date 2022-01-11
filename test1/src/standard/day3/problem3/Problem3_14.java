package standard.day3.problem3;

public class Problem3_14 {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = (int) (Math.random() * 10) + 1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        if (num1 < num2) {
            System.out.println("num2の方が大きいです．");
        } else if (num1 > num2) {
            System.out.println("num1の方が大きいです．");
        } else {
            System.out.println("等しいです．");
        }
    }
}
