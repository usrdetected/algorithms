package cs.algorithms.sorting;

import java.util.Arrays;

public class ShellSort implements Sortable<int[]> {

    @Override
    public int[] sort(final int[] elements) {
        int[] sortElements = Arrays.copyOf(elements, elements.length);
        int elementsCount = sortElements.length;

        int h = 1;

        while (h < elementsCount / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < elementsCount; i++) {
                for (int j = i; j >= h && sortElements[j] < sortElements[j - h]; j -= h) {
                    int temp = sortElements[j];
                    sortElements[j] = sortElements[j - h];
                    sortElements[j - h] = temp;
                }
            }
            h = h / 3;
        }

        return sortElements;
    }

}
