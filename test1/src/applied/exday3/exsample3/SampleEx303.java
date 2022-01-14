package applied.exday3.exsample3;

public class SampleEx303 {
    public static void main(String[] args) {
        Bird b[] = new Bird[2];
        b[0] = new Crow2();
        b[1] = new Sparrow2();
        int i;

        for (i = 0; i < b.length; i++) {
            System.out.print(b[i].getName() + " : ");
            b[i].sing();
        }
    }
}
