package algorithms.binarySearch;

/**
 * Created by ksamykandil on 10/25/14.
 */
public class BinarySearch {
    /**
     * Function that will search for value in sorted array using Binary Search technique.
     * Order: O(Log(N)).. where N is the length of the array.
     *
     * Binary Search Technique is dividing the sorted array from the middle,
     *      1- If sortedArray[middle] < value .. Search in the Second Half.
     *      2- If sortedArray[middle] > value .. Search in the First Half.
     *
     * @param sortedArray
     * @param value
     * @return
     */
    public int find(int[] sortedArray, int value) {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start < end) {
            int middle = (start + end) / 2; //The index of the middle element.
            if (sortedArray[middle] == value)
                return middle;

            // If sortedArray[middle] < value .. Search in the Second Half.
            if (sortedArray[middle] < value)
                start = middle + 1;

            // If sortedArray[middle] > value .. Search in the First Half.
            if (sortedArray[middle] > value)
                end = middle - 1;
        }

        return -1; // Value is not found in the array.
    }
}
