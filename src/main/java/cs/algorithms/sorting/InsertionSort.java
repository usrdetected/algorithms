package cs.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort implements Sortable<int[]> {

    @Override
    public int[] sort(final int[] elements) {
        int[] sortElements = Arrays.copyOf(elements, elements.length);
        int elementsCount = sortElements.length;

        for (int i = 0; i < elementsCount; i++) {
            for (int j = i; j > 0; j--) {
                if (sortElements[j] < sortElements[j-1]) {
                    int temp = sortElements[j];
                    sortElements[j] = sortElements[j-1];
                    sortElements[j-1] = temp;
                } else {
                    break;
                }
            }
        }

        return sortElements;
    }

}
