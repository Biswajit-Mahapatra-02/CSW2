package CSW1004;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr,n);
        System.out.println("Elements after insertion sort: "+ Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr, int size){
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
