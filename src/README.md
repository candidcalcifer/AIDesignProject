# Generic Insertion Sort

This program demonstrates a generic implementation of the insertion sort algorithm in Java, allowing users to sort arrays of various data types such as integers, strings, and floats. The generic sorting class, `GenericInsertionSort`, leverages Java generics to provide a single sorting solution for multiple data types.

## Features

- **Generic Insertion Sort**: The program uses the insertion sort algorithm to sort arrays of any data type that extends the `Comparable` interface.
- **Sorting Order**: Users can sort arrays in ascending order. The program currently does not support descending order sorting.
- **Strategy Design Pattern**: The sorting algorithms are organized using the Strategy design pattern. The `SortAlgorithm` interface acts as the strategy, and the concrete sorting algorithm classes (e.g., `GenericInsertionSort`) represent the concrete strategies. This design allows for interchangeable sorting algorithms without modifying the client code.
- **Factory Method Design Pattern**: The Factory Method design pattern is used in the `SortAlgorithmFactory` class to create instances of `SortAlgorithm` based on the data type provided. This abstraction simplifies the creation of sorting algorithms and decouples the client code from the specific sorting algorithm classes.
- **Unit Tests**: The program includes a comprehensive set of unit tests to verify the correctness of the sorting algorithm and handle edge cases.

## How to Use the Program

1. **Requirements**: Ensure you have Java (JRE or JDK) installed on your machine.

2. **Clone the Repository**: Clone this repository to your local machine using Git or download it as a ZIP file and extract it.

3. **Open the Project**: Navigate to the project's root directory.

4. **Choose Data Type and Array**: In the `Main.java` file, you can modify the array `arr` in the `main` method with the data type and elements you want to sort.

   Example for sorting an array of integers:
   ```java
   Integer[] intArr = {12, 11, 13, 5, 6};

## Use Cases

1. **Sorting Arrays of Various Data Types**: The program is useful when you need to sort arrays containing elements of different data types. You can sort integers, strings, and floats with a single generic sorting class.

## User Stories

1. As a developer, I want to sort an array of integers in ascending order, so I can display the data in a more organized manner.
2. As a data analyst, I want to sort an array of strings alphabetically, so I can present the information in a more readable format.
3. As a researcher, I want to sort an array of floating-point numbers, so I can analyze the data with improved accuracy.

## Design Patterns

The program employs the following design patterns:

1. **Strategy Design Pattern**: The Strategy pattern is used to encapsulate different sorting algorithms into separate classes. The `SortAlgorithm` interface acts as the strategy, while the sorting algorithm classes (e.g., `GenericInsertionSort`) represent the concrete strategies. This design enables interchangeable sorting algorithms without modifying the client code.

2. **Factory Method Design Pattern**: The Factory Method pattern is used in the `SortAlgorithmFactory` class to create instances of `SortAlgorithm` based on the data type provided. This abstraction simplifies the creation of sorting algorithms and decouples the client code from the specific sorting algorithm classes.

## Contribution

Contributions to the project are welcome! If you find any issues, feel free to open an issue or submit a pull request with proposed improvements.

## License

This project is licensed under the MIT License - see the `LICENSE` file for details.
