package day5.problem5;

public class Problem5_4 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int up[] = new int[10];
        int down[] = new int[10];
        int i;
        int cnt_up = 0, cnt_down = 0;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100) + 1;
            System.out.print(data[i] + ", ");

            if (50 <= data[i]) {
                up[cnt_up] = data[i];
                cnt_up++;
            } else {
                down[cnt_down] = data[i];
                cnt_down++;
            }
        }

        System.out.print("\n50以上の数：");
        for (i = 0; i < cnt_up; i++) {
            System.out.print(up[i] + ", ");
        }

        System.out.print("\n50未満の数：");
        for (i = 0; i < cnt_down; i++) {
            System.out.print(down[i] + ", ");
        }
    }
}
