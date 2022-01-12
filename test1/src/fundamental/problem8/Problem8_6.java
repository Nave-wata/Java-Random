package fundamental.problem8;

public class Problem8_6 {

    public static void main(String[] args) {
        int si1 = (int) (Math.random() * 10) + 1;
        int bo1 = (int) (Math.random() * 9) + 1 + 1;
        int si2 = (int) (Math.random() * 10) + 1;
        int bo2 = (int) (Math.random() * 9) + 1 + 1;
        int si_ans, bo_ans, tai, i;

        System.out.print(si1 + "/" + bo1 + " + " + si2 + "/" + bo2 + " = ");

        bo_ans = bo1 * bo2;
        si1 *= bo2;
        si2 *= bo1;
        si_ans = si1 + si2;

        for (i = bo_ans; 0 < i; i--) {
            if (bo_ans % i == 0 && si_ans % i == 0) {
                bo_ans /= i;
                si_ans /= i;
            }
        }

        if (si_ans >= bo_ans) {
            tai = si_ans / bo_ans;
            si_ans /= bo_ans;

            if (bo_ans == 1) {
                System.out.println(tai);
            } else {
                System.out.println(tai + ". " + si_ans + "/" + bo_ans);
            }

        } else {
            if (bo_ans == 1) {
                System.out.println(si_ans);
            } else {
                System.out.println(si_ans + "/" + bo_ans);
            }
        }
    }
}
