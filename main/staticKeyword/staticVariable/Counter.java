package main.staticKeyword.staticVariable;

public class Counter {
    private int count;

    public Counter() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
