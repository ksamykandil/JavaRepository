package algorithms.binarySearch;

/**
 * Created by ksamykandil on 10/25/14.
 */
public class BinarySearch {
    /**
     * Function that will search for value in sorted array using Binary Search algorithm.
     * <p/>
     * Binary Search algorithm details is in the file "BinarySearch"
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

    public void test() {
        int sortedArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(find(sortedArray, 2));
        System.out.println(find(sortedArray, 5));
        System.out.println(find(sortedArray, 8));
    }
}
