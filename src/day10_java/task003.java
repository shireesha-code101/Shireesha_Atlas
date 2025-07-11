package day10_java;

public class task003 {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {40,50,70,80,20};
        System.out.print("before Sorting: ");
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for(int i = 1; i<n; i++) {
            int key = arr[i];
            int j = i;
            while(j > 0 && arr[j-1]>key) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
        System.out.print("After Sorting: ");
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

