package sorting;

public class SortAlgorithmFactory {

    public static <T extends Comparable<T>> SortAlgorithm<T> createSortAlgorithm() {
        return new GenericInsertionSort<>();
    }
}
