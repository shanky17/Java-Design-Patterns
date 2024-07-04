package main.behavioralPatterns.strategy;

public class BubbleSortStrategy implements SortingStrategy {
    private void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    @Override
    public void sort(int[] array, int n) {
        long start = System.nanoTime();
        bubbleSort(array, n);
        long end = System.nanoTime();

        double execTime = (double) (end - start) / 1000000;
        System.out.println("Sorting array using Bubble sort: took " + execTime + "ms");
    }
}
