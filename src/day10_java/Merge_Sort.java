package day10_java;

public class Merge_Sort {
    static int[] a = {10, 15, 20, 30, 45, 59, 5, 87, 9};
    static int[] b = {19, 12, 21, 30, 48, 56, 7, 86, 8};

    static void merging(int low, int mid, int high) {
        int l1 = low, l2 = mid + 1;
        int[] temp = new int[high - low + 1];
        int i = 0;

        // Merge the two sorted halves into temp[]
        while (l1 <= mid && l2 <= high) {
            if (a[l1] <= a[l2]) {
                temp[i++] = a[l1++];
            } else {
                temp[i++] = a[l2++];
            }
        }
        while (l1 <= mid) temp[i++] = a[l1++];
        while (l2 <= high) temp[i++] = a[l2++];

        // Copy back to the original array
        for (int j = 0; j < temp.length; j++) {
            a[low + j] = temp[j];
        }
    }

    static void sort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merging(low, mid, high);
        }
    }

    public static void main(String[] args) {
        System.out.println("Before sorting:");
        for (int num : a) System.out.print(num + " ");
        sort(0, a.length - 1);
        System.out.println("\nAfter sorting:");
        for (int num : a) System.out.print(num + " ");
    }
}
