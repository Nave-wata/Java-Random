package applied.exday3.exsample3;

public abstract class Bird {
    private String name;

    Bird(String name) { // 引数付きコンストラクタ
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 鳴く（抽象メソッド）
    abstract void sing();
}
