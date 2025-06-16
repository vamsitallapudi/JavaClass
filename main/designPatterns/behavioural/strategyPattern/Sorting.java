package main.designPatterns.behavioural.strategyPattern;

public class Sorting {
    SortingStrategy strategy;
    public Sorting(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] arr) {
        strategy.sort(arr);
    }
}
