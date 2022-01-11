package standard.day3.problem3;

public class Problem3_13 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 3) + 1;

        System.out.println("数値：" + num);

        switch (num) {
            case 1:
                System.out.println("グー");
                break;
            case 2:
                System.out.println("チョキ");
                break;
            case 3:
                System.out.println("パー");
                break;
            default:
                System.out.println("例外が発生しました．");
                break;
        }
    }
}
