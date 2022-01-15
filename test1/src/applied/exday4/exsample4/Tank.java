package applied.exday4.exsample4;

public class Tank extends Weapon implements ICar, ICannon {
    public Tank() {
        super("戦車");
    }

    public void fire() {
        System.out.println("砲撃");
    }

    public void move() {
        System.out.println("移動");
    }

    public void attack() {
        System.out.println(this.getName() + "の攻撃方法");
        System.out.println("---------------");
        fire();
        move();
        System.out.println("---------------");
    }
}
