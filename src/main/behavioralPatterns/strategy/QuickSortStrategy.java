package main.behavioralPatterns.strategy;

public class QuickSortStrategy implements SortingStrategy {
    private static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    private int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;

        for (int j = start; j <= end; j++) {
            if (ar[j] < pivot) {
                swap(ar, i, j);
                i++;
            }
        }

        swap(ar, i, end);
        return i;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIdx = partition(arr, start, end);
            quickSort(arr, start, partitionIdx - 1);
            quickSort(arr, partitionIdx + 1, end);
        }
    }

    @Override
    public void sort(int[] array, int n) {
        long start = System.nanoTime();
        quickSort(array, 0, n - 1);
        long end = System.nanoTime();

        double execTime = (double) (end - start) / 1000000;
        System.out.println("Sorting array using Quick sort: took " + execTime + "ms");
    }
}
