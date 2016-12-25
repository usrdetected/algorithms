package cs.algorithms.sorting;


import java.util.Arrays;

public class SelectionSort implements Sortable<int[]> {

    @Override
    public int[] sort(final int[] elements) {
        int[] sortElements = Arrays.copyOf(elements, elements.length);
        int elementsCount = sortElements.length;

        for (int i = 0; i < elementsCount - 1; i++) {
            int min = i;
            for (int j = i + 1; j < elementsCount; j++) {
                if (sortElements[j] < sortElements[min]) {
                    min = j;
                }
            }
            int temp = sortElements[i];
            sortElements[i] = sortElements[min];
            sortElements[min] = temp;
        }

        return sortElements;
    }

}
