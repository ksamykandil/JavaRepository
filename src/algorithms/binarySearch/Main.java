package algorithms.binarySearch;

/**
 * Created by ksamykandil on 10/25/14.
 */
public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int sortedArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch.find(sortedArray, 2));
        System.out.println(binarySearch.find(sortedArray, 5));
        System.out.println(binarySearch.find(sortedArray, 8));
    }
}
