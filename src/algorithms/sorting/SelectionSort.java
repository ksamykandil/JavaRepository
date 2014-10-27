package algorithms.sorting;

/**
 * Created by ksamykandil on 10/27/14.
 */
public class SelectionSort {
    /**
     * Selection sort details is in the text file "Sort"
     */
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    public void test(){
        int array[] = new int[]{10, 9, 8, 4, 6, 5, 7, 1, 3, 2};
        sort(array);

        System.out.println("Selection Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
