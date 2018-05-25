package examples.sortingalgorithm;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<T>> implements SortingAlgorithm<T> {
    @Override
    public T[] sort(T[] arrayToSort) {
        if(arrayToSort == null) {
            throw new IllegalArgumentException();
        }

        // Copy array to prevent failure atomicity
        T[] result = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for(int currentIteration = 0, lastIteration = result.length - 1; currentIteration < lastIteration; currentIteration++) {
            int indexMinimum = currentIteration;
            T currentMinimumElement = result[indexMinimum];
            // Loop to look for the minimum
            for(int currentIndex = currentIteration + 1, lastIndex = arrayToSort.length; currentIndex < lastIndex; currentIndex++) {
                T nextElement = result[currentIndex];
                if(currentMinimumElement.compareTo(nextElement) > 0) {
                    indexMinimum = currentIndex;
                    currentMinimumElement = result[indexMinimum];
                }
            }
            // Exchange positions
            if(indexMinimum != currentIteration) {
                result[indexMinimum] = result[currentIteration];
                result[currentIteration] = currentMinimumElement;
            }
        }
        return result;
    }
}
