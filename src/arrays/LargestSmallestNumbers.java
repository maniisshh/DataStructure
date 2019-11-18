package arrays;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3, 1, 3, 6, 6};
        int n = arr.length;

        findLargestSmallest(arr, n);
    }

    private static void findLargestSmallest(int[] arr, int n) {
        int minValue = arr[0];
        int maxValue = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            } else if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Smallest Value : " + minValue + " Largest Value : " + maxValue);
    }
}
