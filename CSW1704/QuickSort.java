package CSW1704;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
//    public static int Partition(int[] arr, int p, int r){
////        int x = arr[r];
//        int i = p-1;
//        for (int j = p; j < r-1; j++) {
//            if(arr[j]<=arr[r]){
//                i++;
////                if(arr[i]>arr[j])
//                    swap(arr,i,j);
//            }
//        }
////        if(arr[i+1]>arr[r])
//            swap(arr,i+1,r);
//        return i+1;
//    }
//    public static void quickSort(int[] arr, int p, int r){
//        if(p<r){
//            int q = Partition(arr, p, r);
//            quickSort(arr,p,q-1);
//            quickSort(arr,q+1,r);
//        }
//    }
private static void quickSort(int[] arr, int lower, int upper) {
    if (upper <= lower)
        return;
    int pivot = arr[lower];
    int start = lower;
    int stop = upper;
    while (lower < upper) {
        while (arr[lower] <= pivot && lower < upper) {
            lower++;
        }
        while (arr[upper] > pivot && lower <= upper) {
            upper--;
        }
        if (lower < upper) {
            swap(arr, upper, lower);
        }
    }
    swap(arr, upper, start); // upper is the pivot position
    quickSort(arr, start, upper - 1); // pivot -1 is the upper for left sub array.
            quickSort(arr, upper + 1, stop); // pivot + 1 is the lower for right sub array
}
    public static void sort(int[] arr) {
        int size = arr.length;
        quickSort(arr, 0, size - 1);
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        System.out.println("Elements after sorting: "+ Arrays.toString(arr));
    }
}
