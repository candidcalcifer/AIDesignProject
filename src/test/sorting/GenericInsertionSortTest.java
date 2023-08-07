package test.sorting;

import sorting.GenericInsertionSort;
import sorting.SortAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the GenericInsertionSort class.
 */
public class GenericInsertionSortTest {

    /**
     * Test sorting an array of integers.
     */
    @Test
    void testIntegerSort() {
        // Test data
        Integer[] arr = {10, -5, 0, 8, -3, 15, 7};

        // Perform sorting
        SortAlgorithm<Integer> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        Integer[] expected = {-5, -3, 0, 7, 8, 10, 15};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an array of strings.
     */
    @Test
    void testStringSort() {
        // Test data
        String[] arr = {"banana", "orange", "apple", "grape"};

        // Perform sorting
        SortAlgorithm<String> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        String[] expected = {"apple", "banana", "grape", "orange"};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an array of floats.
     */
    @Test
    void testFloatSort() {
        // Test data
        Float[] arr = {3.14f, -2.5f, 0.0f, 1.2f, -4.0f};

        // Perform sorting
        SortAlgorithm<Float> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        Float[] expected = {-4.0f, -2.5f, 0.0f, 1.2f, 3.14f};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an empty array.
     */
    @Test
    void testEmptyArray() {
        // Test data
        Integer[] arr = {};

        // Perform sorting
        SortAlgorithm<Integer> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        Integer[] expected = {};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an array with a single element.
     */
    @Test
    void testSingleElementArray() {
        // Test data
        String[] arr = {"apple"};

        // Perform sorting
        SortAlgorithm<String> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        String[] expected = {"apple"};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an array that is already sorted.
     */
    @Test
    void testAlreadySortedArray() {
        // Test data
        Integer[] arr = {1, 2, 3, 4, 5};

        // Perform sorting
        SortAlgorithm<Integer> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        Integer[] expected = {1, 2, 3, 4, 5};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an array sorted in reverse order.
     */
    @Test
    void testReverseSortedArray() {
        // Test data
        Integer[] arr = {5, 4, 3, 2, 1};

        // Perform sorting
        SortAlgorithm<Integer> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        Integer[] expected = {1, 2, 3, 4, 5};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }

    /**
     * Test sorting an array with null elements.
     */
    @Test
    void testNullElementsArray() {
        // Test data
        Integer[] arr = {null, 5, null, 1, null};

        // Perform sorting
        SortAlgorithm<Integer> sorter = new GenericInsertionSort<>();
        sorter.sort(arr);

        // Expected result
        Integer[] expected = {null, null, null, 1, 5};

        // Assertion
        Assertions.assertArrayEquals(expected, arr);
    }
}
