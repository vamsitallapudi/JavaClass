package main.staticKeyword.staticVariable;

public class CounterWithStatic {
    private static int count;

    public CounterWithStatic() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        CounterWithStatic.count = count;
    }
}

