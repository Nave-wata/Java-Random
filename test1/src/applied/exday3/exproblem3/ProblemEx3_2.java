package applied.exday3.exproblem3;

public class ProblemEx3_2 {
    public static void main(String[] args) {
        Computer cp[] = new Computer[3];
        cp[0] = new PersonalComputer();
        cp[1] = new TabletPC();
        cp[2] = new SmartPhone();

        for (Computer c : cp) {
            c.showTyep();
            c.input();
            c.communication();
            System.out.println("--------------------------------------");
        }
    }
}
