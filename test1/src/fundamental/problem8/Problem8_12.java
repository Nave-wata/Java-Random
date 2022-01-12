package fundamental.problem8;

public class Problem8_12 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 99) + 1 + 1;
        int sosu[] = new int[num];
        int i, j, tmp;
        int cnt_sosu = 0;
        boolean flag = true;

        System.out.println("数値：" + num);

        if (num != 2) {
            for (i = 2; i <= num; i++) {
                flag = true;
                for (j = i - 1; 2 <= j; j--) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    sosu[cnt_sosu] = i;
                    cnt_sosu++;
                }
            }
        } else {
            sosu[cnt_sosu] = 2;
            cnt_sosu++;
        }

        i = 0;
        tmp = 0;
        flag = true;
        System.out.print(num + " = ");
        while (true) {
            if (num % sosu[i] == 0) {
                if (flag) {
                    System.out.print(sosu[i]);
                    num /= sosu[i];
                    tmp = num / sosu[i];
                    i = 0;
                    flag = false;
                } else {
                    System.out.print(" * " + sosu[i]);
                    num /= sosu[i];
                    tmp = num / sosu[i];
                    i = 0;
                }
            } else {
                i++;
            }
            if (sosu[i] == 0) {
                if (tmp != 0) {
                    System.out.print(tmp);
                    break;
                } else {
                    break;
                }
            }
        }
    }
}
