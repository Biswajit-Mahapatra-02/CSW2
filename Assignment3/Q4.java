package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a value: ");
        int val = sc.nextInt();
        System.out.println("The given value is: "+val);
        System.out.println("Moving all the elements less than "+val+" to the start of the array....");
        int swaps = minSwaps(arr,val);
        System.out.println("The current array: "+ Arrays.toString(arr));
        System.out.println("The minimum number of swaps required to bring all the elements that are less than " +
                "the given value together to the start of the array: "+swaps);
    }
    public static int minSwaps(int[] arr, int val){
        int swaps = 0, pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<val){
                swap(arr,i,pointer);
                pointer++;
                swaps++;
            }
        }
        return swaps;
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
