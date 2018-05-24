package examples.sortingalgorithm;

public interface SortingAlgorithm<T extends Comparable<T>> {
    T[] sort(T[] arrayToSort);
}
