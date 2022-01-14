package applied.exday3.exsample3;

public class SampleClassEx301 {
    public static void main(String[] args) {
        Crow1 c = new Crow1();
        Sparrow1 s = new Sparrow1();

        System.out.print(c.getName() + " : ");
        c.sing();

        System.out.print(s.getName() + " : ");
        s.sing();
    }
}
