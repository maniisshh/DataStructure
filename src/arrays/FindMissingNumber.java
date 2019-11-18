package arrays;

/**
 * Find missing number in given array between 1 to n.
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int n = 10;
        //findMissingNumber(arr, n);
        findMissingNumberUsingXOR(arr, n);
    }

    private static void findMissingNumberUsingXOR(int[] arr, int n) {
        int missingNumber = 0;
        int x = 0, y = 0;

        for (int i = 1; i <= n; i++) {
            x ^= i;
        }
        for (int i = 0; i < arr.length; i++) {
            y ^= arr[i];
        }

        missingNumber = x ^ y;

        System.out.println("Missing number is " + missingNumber);
    }

    private static void findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Missing number is " + (total - sum));
    }
}
