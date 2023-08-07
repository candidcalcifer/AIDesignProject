package test.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sorting.GenericInsertionSort;
import sorting.SortAlgorithm;

public class InsertionSortTest {
    @Test
    public void testIntegerInsertionSort() {
        Integer[] arr = {5, 2, 1, 6, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        SortAlgorithm<Integer> sorter = new GenericInsertionSort();
        sorter.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testStringInsertionSort() {
        String[] arr = {"apple", "orange", "banana", "grape", "kiwi"};
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange"};

        SortAlgorithm<String> sorter = new GenericInsertionSort();
        sorter.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        Integer[] arr = {};
        Integer[] expected = {};

        SortAlgorithm<Integer> sorter = new GenericInsertionSort();
        sorter.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        Integer[] arr = {42};
        Integer[] expected = {42};

        SortAlgorithm<Integer> sorter = new GenericInsertionSort();
        sorter.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithDuplicates() {
        Integer[] arr = {3, 2, 4, 3, 1, 2, 1, 4};
        Integer[] expected = {1, 1, 2, 2, 3, 3, 4, 4};

        SortAlgorithm<Integer> sorter = new GenericInsertionSort();
        sorter.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testFloatInsertionSort() {
        Float[] arr = {3.14f, 2.71f, 1.618f, 0.707f, 2.718f};
        Float[] expected = {0.707f, 1.618f, 2.71f, 2.718f, 3.14f};

        SortAlgorithm<Float> sorter = new GenericInsertionSort();
        sorter.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }
}
