package CSW2103;

import java.util.Arrays;
import java.util.Scanner;

// Given a sorted array, arrange the elements of the array in max min form
// I/P: 1 2 3 4 5 6 7
// O/P: 7 1 6 2 5 3 4
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The generated sequence is: "+ Arrays.toString(maxMin(arr)));
    }
    // Time complexity: O(N)
    static int[] maxMin(int[] arr){
        int i=0,j=arr.length-1,x=0;
        int[] temp = new int[arr.length];
        while(i<j){
            temp[x++] = arr[j--];
            temp[x++] = arr[i++];
        }
        temp[x] = arr[i];
        return temp;
    }
}
