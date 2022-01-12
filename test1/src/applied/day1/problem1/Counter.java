package applied.day1.problem1;

public class Counter {

    private int count = 0;

    public void reset() {
        count = 0;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
