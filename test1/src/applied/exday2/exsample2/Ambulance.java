package applied.exday2.exsample2;

public class Ambulance extends Car {

    private int number = 119;

    public Ambulance() {
        System.out.println("Ambulanceオブジェクト作成");
    }

    public void sevePeople() {
        System.out.println("救急救命活動");
        System.out.println("呼び出しは " + number + " 番");
    }
}
