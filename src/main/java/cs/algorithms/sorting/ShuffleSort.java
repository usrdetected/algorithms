package cs.algorithms.sorting;

import java.util.Random;

public class ShuffleSort implements Sortable<int[]> {

    private Sortable<int[]> insertionSort = new InsertionSort();

    @Override
    public int[] sort(int[] elements) {
        int[] sortedElements = insertionSort.sort(elements);
        int elementsCount = sortedElements.length;

        Random random = new Random();
        for (int i = 0; i < elementsCount; i++) {
            int r = random.nextInt(i + 1);
            int temp = sortedElements[i];
            sortedElements[i] = sortedElements[r];
            sortedElements[r] = temp;
        }

        return sortedElements;
    }

}
