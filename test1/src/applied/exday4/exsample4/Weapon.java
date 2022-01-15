package applied.exday4.exsample4;

public abstract class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();
}
