package algorithms.sorting;

/**
 * Created by ksamykandil on 10/25/14.
 */
public class Main {
    public static void main(String[] args) {
        // Test the bubble sort.
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.test();

        // Test the selection sort.
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.test();

        // Test the insertion sort.
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.test();
    }
}
