package standard.day5.problem5;

public class Problem5_3 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int gu[] = new int[10];
        int ki[] = new int[10];
        int i;
        int cnt_gu = 0, cnt_ki = 0;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100) + 1;

            System.out.print(data[i] + ", ");

            if (data[i] % 2 == 0) {
                gu[cnt_gu] = data[i];
                cnt_gu++;
            } else {
                ki[cnt_ki] = data[i];
                cnt_ki++;
            }
        }
        System.out.println("\n");

        System.out.print("奇数：");
        for (i = 0; i < cnt_ki; i++) {
            System.out.print(ki[i] + ", ");
        }

        System.out.print("\n偶数：");
        for (i = 0; i < cnt_gu; i++) {
            System.out.print(gu[i] + ", ");
        }
    }
}
