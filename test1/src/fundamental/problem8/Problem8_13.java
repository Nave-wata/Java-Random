package fundamental.problem8;

public class Problem8_13 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int i, j, tmp, max;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10) + 1;
            System.out.print(data[i] + ", ");
        }

        for (i = 0; i < data.length; i++) {
            max = i;
            for (j = i + 1; j < data.length; j++) {
                if (data[max] < data[j]) {
                    max = j;
                }
            }
            tmp = data[i];
            data[i] = data[max];
            data[max] = tmp;
        }

        System.out.println();
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }
}
