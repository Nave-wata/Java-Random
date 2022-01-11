package standard.day5.problem5;

public class Problem5_6 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int max = 0, min = 10, sum = 0;
        int i;
        double avg;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10) + 1;
            sum += data[i];

            System.out.print(data[i] + ", ");

            if (max < data[i]) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }

        avg = sum / data.length;

        System.out.println("\n最大値：" + max);
        System.out.println("最小値：" + min);
        System.out.println("平均値：" + avg);

    }
}
