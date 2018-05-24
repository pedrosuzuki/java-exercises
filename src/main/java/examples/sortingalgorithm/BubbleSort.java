package examples.sortingalgorithm;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> implements SortingAlgorithm<T> {
    @Override
    public T[] sort(T[] arrayToSort) {
        if(arrayToSort == null) {
            throw new IllegalArgumentException();
        }

        // Copy array to prevent failure atomicity
        T[] result = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for(int currentIteration = 0, lastIteration = result.length - 1; currentIteration < lastIteration; currentIteration++) {
            for(int currentIndex = 0, lastIndex = lastIteration - currentIteration - 1; currentIndex <= lastIndex; currentIndex++) {
                T currentElement = result[currentIndex];
                T nextElement = result[currentIndex + 1];
                if(currentElement.compareTo(nextElement) > 0) {
                    result[currentIndex] = nextElement;
                    result[currentIndex + 1] = currentElement;
                }
            }
        }
        return result;
    }
}
