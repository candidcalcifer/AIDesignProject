package test.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sorting.GenericInsertionSort;
import sorting.SortAlgorithm;
import sorting.SortAlgorithmFactory;

/**
 * Unit tests for the SortAlgorithmFactory class.
 */
public class SortAlgorithmFactoryTest {

    /**
     * Test creating a SortAlgorithm instance for sorting an array of integers.
     */
    @Test
    void testCreateIntegerSortAlgorithm() {
        // Create the SortAlgorithm instance
        SortAlgorithm<Integer> sorter = SortAlgorithmFactory.createSortAlgorithm();

        // Assertion: The created instance should be of GenericInsertionSort type
        assertTrue(sorter instanceof GenericInsertionSort);
    }

    /**
     * Test creating a SortAlgorithm instance for sorting an array of strings.
     */
    @Test
    void testCreateStringSortAlgorithm() {
        // Create the SortAlgorithm instance
        SortAlgorithm<String> sorter = SortAlgorithmFactory.createSortAlgorithm();

        // Assertion: The created instance should be of GenericInsertionSort type
        assertTrue(sorter instanceof GenericInsertionSort);
    }

    /**
     * Test creating a SortAlgorithm instance for sorting an array of floats.
     */
    @Test
    void testCreateFloatSortAlgorithm() {
        // Create the SortAlgorithm instance
        SortAlgorithm<Float> sorter = SortAlgorithmFactory.createSortAlgorithm();

        // Assertion: The created instance should be of GenericInsertionSort type
        assertTrue(sorter instanceof GenericInsertionSort);
    }

    // You can add more tests here for other data types or custom classes.
}
