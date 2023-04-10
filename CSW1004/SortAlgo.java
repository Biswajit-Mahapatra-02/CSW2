package CSW1004;
// Class assignment 1004
import java.util.Arrays;
import java.util.Scanner;

public class SortAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        System.arraycopy(arr, 0, arr1, 0, n);
        BubbleSort(arr,n);
        System.out.println("Elements after bubble sort: "+ Arrays.toString(arr));
        SelectionSort(arr1,n);
        System.out.println("Elements after selection sort: "+ Arrays.toString(arr1));
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void BubbleSort(int[] arr, int size){
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void SelectionSort(int[] arr, int size){
        for (int i = 0; i < size-1; i++) {
            int min = i;
            for (int j = i; j < size ; j++) {
                if(arr[j]<arr[min])
                    min = j;
            }
            swap(arr,i,min);
        }
    }
}
