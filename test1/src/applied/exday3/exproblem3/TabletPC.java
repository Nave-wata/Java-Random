package applied.exday3.exproblem3;

public class TabletPC extends Computer {
    public TabletPC() {
        super("タブレット");
    }

    public void input() {
        System.out.println("タッチパネルディスプレイをタップして操作");
    }

    public void output() {
        System.out.println("タッチパネルディスプレイに出力");
    }
}
