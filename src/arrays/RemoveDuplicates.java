package arrays;

/**
 * Class to remove all the duplicates element in given array
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 12, 12, 30, 44, 44, 44, 85};
        int n = arr.length;

        System.out.println("Before removing");
        printArray(arr, arr.length);

        removeDuplicates2(arr, n);
    }

    /**
     * Method to print array
     *
     * @param arr
     * @param n
     */
    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    /**
     * Remove Duplicate Element in Array using Temporary Array
     *
     * @param arr
     * @param n
     */
    private static void removeDuplicates(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        System.out.println("\nAfter removing");
        printArray(arr, j);
    }

    /**
     * Method 2: (Constant extra space)
     * Remove Duplicate Element in Array using separate index
     *
     * @param arr
     * @param n
     */
    public static void removeDuplicates2(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[n - 1];

        System.out.println("\nAfter removing");
        printArray(arr, j);
    }
}
