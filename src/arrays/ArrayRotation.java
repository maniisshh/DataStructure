package arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length, d = 2;

        System.out.println("Before Rotation");
        printArray(arr, n);

        //leftRotate(arr, d, n);

        //leftRotateByTempMethod(arr, n, d);

        rightRotate(arr, d, n);

    }

    private static void rightRotate(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            rightRotateByOne(arr, n);
        }

        System.out.println("\n After Rotation");
        printArray(arr, n);
    }

    private static void rightRotateByOne(int[] arr, int n) {
        int temp = arr[n - 1];

        for (int i = n-1; i > 0; i--) {
            arr[i ] = arr[i-1];
        }
        arr[0] = temp;
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

    private static void leftRotateByTempMethod(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        int i;
        for (i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int j = 0; j < d; j++) {
            arr[i] = temp[j];
            i++;
        }

        System.out.println("\n After Rotation");
        printArray(arr, n);

    }
}
