package day5.problem5;

public class Problem5_11 {

    public static void main(String[] args) {
        int data[] = new int[5];
        int ue[] = new int[5];
        int naka[] = new int[5];
        int sita[] = new int[5];
        int cnt_ue = 0, cnt_naka = 0, cnt_sita = 0;
        int i;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100) + 1;
            System.out.print(data[i]);

            if (i != data.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

            if (data[i] < 60) {
                sita[cnt_sita] = data[i];
                cnt_sita++;
            } else if (data[i] < 80) {
                naka[cnt_naka] = data[i];
                cnt_naka++;
            } else {
                ue[cnt_ue] = data[i];
                cnt_ue++;
            }
        }

        System.out.print("\n0以上60未満：");
        for (i = 0; i < cnt_sita; i++) {
            System.out.print(sita[i]);

            if (i != cnt_sita - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.print("60以上80未満：");
        for (i = 0; i < cnt_naka; i++) {
            System.out.print(naka[i]);

            if (i != cnt_naka - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.print("80以上：");
        for (i = 0; i < cnt_ue; i++) {
            System.out.print(ue[i]);

            if (i != cnt_ue - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
