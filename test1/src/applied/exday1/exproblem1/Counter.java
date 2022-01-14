package applied.exday1.exproblem1;

public class Counter {

    private int count = 0;
    static int totalCount = 0;

    public void reset() {
        count = 0;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        totalCount += count;
        return count;
    }

    static int getTotalCount() {
        return totalCount;
    }
}
