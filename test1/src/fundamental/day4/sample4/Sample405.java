package fundamental.day4.sample4;

public class Sample405 {

    public static void main(String[] args) {
        int i;
        int num = 1;

        // while ループで実行
        System.out.print("whileで実行：");
        i = 1;

        while (i < num) {
            System.out.print("*");
            i++;
        }

        System.out.println();

        // do ~ whileループで実行
        System.out.print("do ~ whileで実行：");
        i = 1;

        do {
            System.out.print("*");
            i++;
        } while (i < num);
    }
}
