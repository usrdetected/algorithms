package cs.algorithms.sorting;

import java.util.Arrays;

public class SortAlgorithmRunner {

    public static void main(String[] args) {
        int[] unsortedElements = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        Sortable<int[]> sortStrategy = new ShuffleSort();
        int[] sortedElements = sortStrategy.sort(unsortedElements);

        System.out.println("");
        System.out.println("Before sorting: " + Arrays.toString(unsortedElements));
        System.out.println("--------------");
        System.out.println("After soring:   " + Arrays.toString(sortedElements));
    }

}
