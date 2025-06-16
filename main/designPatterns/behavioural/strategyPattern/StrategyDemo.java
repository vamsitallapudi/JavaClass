package main.designPatterns.behavioural.strategyPattern;

public class StrategyDemo {
    public static void main(String[] args) {
        Sorting sorting = new Sorting(new BubbleSort());
        int[] a = new int[] {1,3};
        sorting.sort(a);
        Sorting sorting2 = new Sorting(new QuickSort());
        sorting2.sort(a);
    }
}
