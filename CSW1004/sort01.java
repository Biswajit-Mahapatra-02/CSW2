package CSW1004;

import java.util.Arrays;
import java.util.Scanner;

public class sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sorting01(arr,arr.length);
        System.out.print("The sorted array: "+ Arrays.toString(arr));
    }
    public static void sorting01(int[] arr, int size){
        int l = 0;
        int r = size-1;
        while(l<r){
            while(arr[l] == 0)
                l++;
            while(arr[r]==1)
                r--;
            if(l<r){
                swap(arr,l,r);
                l++;
                r--;
            }
        }
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
