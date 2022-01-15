package applied.exday4.exsample4;

public class SampleEx402 {
    public static void main(String[] args) {
        Tank t = new Tank();

        System.out.println(t.getName() + " の武器の名前：" + Tank.WEAPON_NAME);
        System.out.println(t.getName() + " の武器のタイプ：" + Tank.TYPE_NAME);

        t.attack();
    }
}
