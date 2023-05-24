public class BASIC {

    // 1. Print 1-n
    public static void printNumbers(int n) {
        if(n == 0) {
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }

    // 2. Print n-1
    public static void printNumbersDescending(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbersDescending(n-1);
    }

    // 3. Print array using recursion
    public static void printArray(int[] arr, int index) {
        if(index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index+1);
    }

    // 4. Print the array in reverse
    public static void printReverseArray(int[] arr, int index) {
        if(index == arr.length) {
            return;
        }
        printReverseArray(arr, index+1);
        System.out.print(arr[index] + " ");
    }

    // 5. Find the maximum of an array
    public static int findMax(int[] arr, int index) {
        if(index == arr.length-1) {
            return arr[index];
        }
        int max = findMax(arr, index+1);
        if(arr[index] > max) {
            return arr[index];
        }
        return max;
    }

    // Test the methods
    public static void main(String[] args) {
        // 1. Print 1-n
        printNumbers(5);
        System.out.println();

        // 2. Print n-1
        printNumbersDescending(5);
        System.out.println();

        // 3. Print array using recursion
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr, 0);
        System.out.println();

        // 4. Print the array in reverse
        printReverseArray(arr, 0);
        System.out.println();

        // 5. Find the maximum of an array
        int[] arr2 = {10, 25, 5, 30, 15};
        int max = findMax(arr2, 0);
        System.out.println("Max: " + max);
    }
}
```