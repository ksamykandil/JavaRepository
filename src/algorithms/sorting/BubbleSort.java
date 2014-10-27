package algorithms.sorting;

/**
 * Created by ksamykandil on 10/27/14.
 */
public class BubbleSort {
    /**
     * Bubble sort details is in the text file "Sort"
     */
    public int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public void test(){
        int array[] = new int[]{10, 9, 8, 4, 6, 5, 7, 1, 3, 2};
        sort(array);

        System.out.println("Bubble Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
