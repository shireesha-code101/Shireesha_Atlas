package day12_java;


import java.util.Arrays;

public class task005 {

    // Function to get the maximum value in the array
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max)
                max = val;
        }
        return max;
    }

    // Counting Sort by digit (exp = 1, 10, 100, ...)
    static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];     // output array
        int[] count = new int[10];     // digit range 0–9

        // Count occurrences of each digit
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Convert count[i] to position index
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Main Radix Sort method
    static void radixSort(int[] arr) {
        int max = getMax(arr); // Get max to determine number of digits

        // Apply counting sort to each digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSortByDigit(arr, exp);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array: " + Arrays.toString(arr));

        radixSort(arr);

        System.out.println("Sorted Array (Radix Sort): " + Arrays.toString(arr));
    }
}

