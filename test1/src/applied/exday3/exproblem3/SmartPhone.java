package applied.exday3.exproblem3;

public class SmartPhone extends Computer {
    public SmartPhone() {
        super("スマートフォン");
    }

    public void input() {
        System.out.println("タッチパネルディスプレイをタップして操作");
    }

    public void output() {
        System.out.println("タッチパネルディスプレイに出力");
    }

    public void communication() {
        System.out.println("インターネットと通信回線で通信");
    }
}
