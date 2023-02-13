package main.staticKeyword.staticVariable;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1.getCount());
        Counter c2 = new Counter();
        System.out.println(c2.getCount());
        Counter c3 = new Counter();
        System.out.println(c3.getCount());

        System.out.println("#####################################");

        CounterWithStatic cs1 = new CounterWithStatic();
        System.out.println(cs1.getCount());
        CounterWithStatic cs2 = new CounterWithStatic();
        System.out.println(cs2.getCount());
        CounterWithStatic cs3 = new CounterWithStatic();
        System.out.println(cs3.getCount());

    }
}
