package main.behavioralPatterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar1 = {5, 6, 1, 8, 4, 2, 3, 9, 13, 7, 12, 20, 10};

        SortingContext sortingContext = new SortingContext();

        sortingContext.setSortingStrategy(new BubbleSortStrategy());
        sortingContext.performSort(Arrays.copyOf(ar1, ar1.length));

        sortingContext.setSortingStrategy(new InsertionSortStrategy());
        sortingContext.performSort(Arrays.copyOf(ar1, ar1.length));

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        sortingContext.performSort(Arrays.copyOf(ar1, ar1.length));
    }
}
