import sorting.GenericInsertionSort;
import sorting.SortAlgorithm;
import sorting.SortAlgorithmFactory;

/**
 * A sample Java program demonstrating the usage of the GenericInsertionSort class to sort arrays of different data types.
 */
public class main {

    /**
     * The main entry point of the program.
     *
     * @param args The command-line arguments (not used in this program).
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

        // Integer array using factory design
        Integer[] factoryIntArr = {12, 11, 13, 5, 6};
        SortAlgorithm<Integer> factoryIntSorter = SortAlgorithmFactory.createSortAlgorithm();
        intSorter.sort(factoryIntArr);

        System.out.println("Sorted Integer Array (Using Insertion Sort):");
        printArray(factoryIntArr);

        // String array using factory design
        String[] factoryStrArr = {"apple", "orange", "banana", "grape", "kiwi"};
        SortAlgorithm<String> factoryStrSorter = SortAlgorithmFactory.createSortAlgorithm();
        strSorter.sort(factoryStrArr);

        System.out.println("Sorted String Array (Using Insertion Sort):");
        printArray(factoryStrArr);

        // Float array using factory design
        Float[] factoryFloatArr = {3.14f, 2.71f, 1.618f, 0.707f, 2.718f};
        SortAlgorithm<Float> factoryFloatSorter = SortAlgorithmFactory.createSortAlgorithm();
        floatSorter.sort(factoryFloatArr);

        System.out.println("Sorted Float Array (Using Insertion Sort):");
        printArray(factoryFloatArr);
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
