package day5.problem5;

public class Problem5_9 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int ue[] = new int[10];
        int sita[] = new int[10];
        int cnt_ue = 0, cnt_sita = 0;
        int i;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100) + 1;
            System.out.print(data[i] + ", ");

            if (50 <= data[i]) {
                ue[cnt_ue] = data[i];
                cnt_ue++;
            } else {
                sita[cnt_sita] = data[i];
                cnt_sita++;
            }
        }

        System.out.print("\n\n50以上の数：");
        for (i = 0; i < cnt_ue; i++) {
            System.out.print(ue[i] + ", ");
        }

        System.out.print("\n50未満の数：");
        for (i = 0; i < cnt_sita; i++) {
            System.out.print(sita[i] + ", ");
        }
    }
}
