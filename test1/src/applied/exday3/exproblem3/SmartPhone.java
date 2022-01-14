package applied.exday3.exproblem3;

public class SmartPhone extends Computer {
    public SmartPhone() {
        super("スマートフォン");
    }

    public void input() {
        System.out.println("キーボード・マウスで入力");
    }

    public void output() {
        System.out.println("ディスプレイに出力");
    }
}
