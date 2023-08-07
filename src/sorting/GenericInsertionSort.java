package sorting;

/**
 * The GenericInsertionSort class provides a generic implementation of the insertion sort algorithm
 * to sort arrays of various data types that extend the Comparable interface.
 *
 * <p>It leverages Java generics to allow sorting of arrays containing elements such as integers,
 * strings, and floats with a single sorting class.
 *
 * <p>This class follows the Strategy design pattern, with SortAlgorithm interface acting as the strategy
 * and GenericInsertionSort representing the concrete strategy. It also benefits from the Factory Method
 * design pattern, which is utilized by the SortAlgorithmFactory to create instances of SortAlgorithm
 * based on the data type provided.
 *
 * @param <T> The type of elements in the array. Must extend the Comparable interface for sorting.
 */
public class GenericInsertionSort<T extends Comparable<T>> implements SortAlgorithm<T> {
    /**
     * Sorts the input array in ascending order using the insertion sort algorithm.
     *
     * @param arr The array to be sorted. The elements in the array must implement the Comparable interface.
     */
    public void sort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
