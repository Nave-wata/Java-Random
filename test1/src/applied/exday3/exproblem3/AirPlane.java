package applied.exday3.exproblem3;

public abstract class AirPlane {
    private String type;

    AirPlane(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract void fly();
}
