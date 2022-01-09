package day5.problem5;

public class Problem5_8 {

    public static void main(String[] args) {
        int data[] = new int[5];
        int cnt_sei = 0, cnt_hu = 0, cnt_zero = 0;
        int i;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 20) + 1 - 10;
            System.out.print(data[i] + ", ");

            if (0 < data[i]) {
                cnt_sei++;
            } else if (data[i] < 0) {
                cnt_hu++;
            } else {
                cnt_zero++;
            }
        }

        System.out.println("\n\n0より大きい数：" + cnt_sei);
        System.out.println("0より小さい数：" + cnt_hu);
        System.out.println("0の個数：" + cnt_zero);
    }
}
