package Q1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The required waveform array is: "+ Arrays.toString(maxMin(arr)));
    }
    public static int[] maxMin(int[] arr){
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
