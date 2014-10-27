package algorithms.sorting;

/**
 * Created by ksamykandil on 10/27/14.
 */
public class InsertionSort {
    /**
     * Insertion sort details is in the text file "Sort"
     */
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;
        }

        return arr;
    }

    public void test(){
        int array[] = new int[]{10, 9, 8, 4, 6, 5, 7, 1, 3, 2};
        sort(array);

        System.out.println("Insertion Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
