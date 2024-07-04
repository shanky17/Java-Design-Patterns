package main.behavioralPatterns.strategy;

public class InsertionSortStrategy implements SortingStrategy {
    private void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    @Override
    public void sort(int[] array, int n) {
        long start = System.nanoTime();
        insertionSort(array, n);
        long end = System.nanoTime();

        double execTime = (double) (end - start) / 1000000;
        System.out.println("Sorting array using Insertion sort: took " + execTime + "ms");
    }
}
