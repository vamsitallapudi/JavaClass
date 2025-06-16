package main.designPatterns.behavioural.strategyPattern;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using " + this.getClass().getSimpleName());
    }
}
