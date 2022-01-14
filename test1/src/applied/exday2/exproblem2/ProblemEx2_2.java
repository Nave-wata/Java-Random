package applied.exday2.exproblem2;

public class ProblemEx2_2 {
    public static void main(String[] args) {
        NewCalc n = new NewCalc();

        n.setNumber1(10);
        n.setNumber2(2);

        System.out.println(n.getNumber1() + " + " + n.getNumber2() + " = " + n.add());
        System.out.println(n.getNumber1() + " - " + n.getNumber2() + " = " + n.sub());
        System.out.println(n.getNumber1() + " * " + n.getNumber2() + " = " + n.mul());
        System.out.println(n.getNumber1() + " / " + n.getNumber2() + " = " + n.div());
    }
}
