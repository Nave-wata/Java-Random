package day5.problem5;

public class Problem5_7 {

    public static void main(String[] args) {
        int data[] = new int[5];
        int ue[] = new int[5];
        int sita[] = new int[5];
        int sum = 0, cnt_ue = 0, cnt_sita = 0;
        int i, avg;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10) + 1;
            sum += data[i];

            System.out.print(data[i] + ", ");
        }

        avg = sum / data.length;

        for (i = 0; i < data.length; i++) {
            if (avg < data[i]) {
                ue[cnt_ue] = data[i];
                cnt_ue++;
            } else if (data[i] < avg) {
                sita[cnt_sita] = data[i];
                cnt_sita++;
            }
        }

        System.out.println("\n\n合計値：" + sum);
        System.out.println("平均値：" + avg + "\n");

        System.out.print("平均値より大きい数：");
        for (i = 0; i < cnt_ue; i++) {
            System.out.print(ue[i] + ", ");
        }

        System.out.print("\n平均値より小さい数：");
        for (i = 0; i < cnt_sita; i++) {
            System.out.print(sita[i] + ", ");
        }

    }
}
