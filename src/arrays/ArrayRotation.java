package arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 7, d = 2;

        System.out.println("Before Rotation");
        printArray(arr, n);

        leftRotate(arr, d, n);
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    private static void leftRotate(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }

        System.out.println("\n After Rotation");
        printArray(arr, n);
    }

    private static void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0], i;
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[i] = temp;

    }
}
