package util;

import sorting.GenericInsertionSort;
import sorting.SortAlgorithm;

/**
 * A utility class that demonstrates the usage of the GenericInsertionSort class for sorting arrays of various data types.
 * This class contains a main method that creates sample arrays of integers, strings, and floats, and uses the
 * GenericInsertionSort class to sort these arrays in ascending order using the insertion sort algorithm.
 */
public class InsertionSort {

    /**
     * The main method demonstrates the usage of GenericInsertionSort to sort arrays of integers, strings, and floats.
     * It creates sample arrays of each data type and prints the sorted arrays.
     *
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Integer array
        Integer[] intArr = {12, 11, 13, 5, 6};
        SortAlgorithm<Integer> intSorter = new GenericInsertionSort<Integer>();
        intSorter.sort(intArr);

        System.out.println("Sorted Integer Array (Using Insertion Sort):");
        printArray(intArr);

        // String array
        String[] strArr = {"apple", "orange", "banana", "grape", "kiwi"};
        SortAlgorithm<String> strSorter = new GenericInsertionSort<String>();
        strSorter.sort(strArr);

        System.out.println("Sorted String Array (Using Insertion Sort):");
        printArray(strArr);

        // Float array
        Float[] floatArr = {3.14f, 2.71f, 1.618f, 0.707f, 2.718f};
        SortAlgorithm<Float> floatSorter = new GenericInsertionSort<Float>();
        floatSorter.sort(floatArr);

        System.out.println("Sorted Float Array (Using Insertion Sort):");
        printArray(floatArr);
    }

    /**
     * Utility method to print an array of any type.
     *
     * @param arr The array to be printed.
     * @param <T> The data type of the elements in the array.
     */
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
