package applied.exday3.exproblem3;

public class PassengerPlane {
    private String type = "旅客機";

    public String getType() {
        return type;
    }

    // 飛行する
    public void fly() {
        System.out.println("乗客を乗せて目的地まで飛行します");
    }

    // 戦闘する
    public void carryPassengers() {
        System.out.println("乗客を目的地まで運びます");
    }
}
