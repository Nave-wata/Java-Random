package day5.problem5;

public class Problem5_5 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int san[] = new int[10];
        int hoka[] = new int[10];
        int i;
        int cnt_san = 0, cnt_hoka = 0;

        for (i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10) + 1;
            System.out.print(data[i] + ", ");

            if (data[i] % 3 == 0) {
                san[cnt_san] = data[i];
                cnt_san++;
            } else {
                hoka[cnt_hoka] = data[i];
                cnt_hoka++;
            }
        }

        System.out.print("\n3の倍数：");
        for (i = 0; i < cnt_san; i++) {
            System.out.print(san[i] + ", ");
        }

        System.out.print("\n3の倍数以外の数：");
        for (i = 0; i < cnt_hoka; i++) {
            System.out.print(hoka[i] + ", ");
        }

    }
}
