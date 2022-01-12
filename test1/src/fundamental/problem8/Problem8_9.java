package fundamental.problem8;

public class Problem8_9 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int gu[] = new int[10];
        int ki[] = new int[10];
        int i;
        int cnt_gu = 0, cnt_ki = 0;

        for (i = 0; i < 10; i++) {
            data[i] = (int) (Math.random() * 100) + 1;
            System.out.print(data[i] + ", ");
        }

        for (i = 0; i < 10; i++) {
            if (data[i] % 2 == 0) {
                gu[cnt_gu] = data[i];
                cnt_gu++;
            } else {
                ki[cnt_ki] = data[i];
                cnt_ki++;
            }
        }

        System.out.print("\n偶数：");
        for (i = 0; i < cnt_gu; i++) {
            System.out.print(gu[i] + ", ");
        }

        System.out.print("\n奇数：");
        for (i = 0; i < cnt_ki; i++) {
            System.out.print(ki[i] + ", ");
        }
    }
}
