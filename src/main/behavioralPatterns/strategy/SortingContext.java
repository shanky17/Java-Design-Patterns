package main.behavioralPatterns.strategy;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    private void printArray(int[] ar) {
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array, array.length);
        printArray(array);
    }
}
