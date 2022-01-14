package applied.exday3.exproblem3;

public abstract class Computer {
    private String type;

    public Computer(String type) {
        this.type = type;
    }

    public abstract void input();

    public abstract void output();

    public void communication() {
        System.out.println("インターネットで通信");
    }

    public void showTyep() {
        System.out.println("コンピュータの種類：" + type);
    }
}
