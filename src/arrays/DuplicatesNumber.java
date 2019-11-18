package arrays;

public class DuplicatesNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 1, 3, 6, 6};
        int n = arr.length;

        findDuplicates3(arr, n);
    }

    /**
     * Method 1
     *
     * @param arr
     * @param n
     */
    private static void findDuplicates(int[] arr, int n) {
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < n; i++) {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }

    /**
     * Method 2
     *
     * @param arr
     * @param n
     */
    private static void findDuplicates2(int[] arr, int n) {
        //int arr[] = {1, 2, 6, 3, 1, 3, 6, 8};

        for (int i = 0; i < n; i++) {
            arr[arr[i] % 10] = arr[arr[i] % 10] + 10;
        }

        System.out.println("The repeating elements are : ");

        for (int i = 0; i < n; i++) {
            if (arr[i] > 19) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Method 3
     *
     * @param arr
     * @param n
     */
    private static void findDuplicates3(int[] arr, int n) {
        //int arr[] = {1, 2, 6, 3, 1, 3, 6, 8};

        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        System.out.println("The repeating elements are : ");

        for (int i = 0; i < n; i++) {
            if (arr[i]/n > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
