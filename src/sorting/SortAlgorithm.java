package sorting;

/**
 * An interface representing a sorting algorithm.
 * This interface defines a single method, sort, which sorts an array of any data type.
 *
 * @param <T> The data type of the elements in the array (Integer, String, Float, etc.).
 */
public interface SortAlgorithm<T> {
    /**
     * Sorts the input array in ascending order using the specific sorting algorithm.
     *
     * @param arr The array to be sorted.
     */
    void sort(T[] arr);
}
