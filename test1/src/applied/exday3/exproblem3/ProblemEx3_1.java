package applied.exday3.exproblem3;

public class ProblemEx3_1 {
    public static void main(String[] args) {
        FighterAiracraft fighter = new FighterAiracraft();
        PassengerPlane airlinear = new PassengerPlane();

        fighter.fly();
        fighter.fight();

        airlinear.fly();
        airlinear.carryPassengers();
    }
}
