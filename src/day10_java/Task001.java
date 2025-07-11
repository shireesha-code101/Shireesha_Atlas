package day10_java;

import static java.util.Collections.swap;

public class Task001 {
    public static void selectionSort(int[] a, int n) {
        for (int i = n - 1; i > 0; i--) {
            int max = i;
            for (int j = 0; j < i; j++) {
                // Find the largest among a[0..i]
                if (a[j] >= a[max]) {
                    max = j;
                }
            }
            swap(a, i, max);
        }
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] a = {5,3,7,2,6,1};
        System.out.println("Before: " + java.util.Arrays.toString(a));
        selectionSort(a, a.length);
        System.out.println("After : " + java.util.Arrays.toString(a));
    }
}
