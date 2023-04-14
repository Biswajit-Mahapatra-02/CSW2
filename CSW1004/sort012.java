package CSW1004;

import java.util.Arrays;
import java.util.Scanner;

public class sort012 {
    public static void sorting012(int[] nums) {
        int zeroFreq=0;
        int oneFreq =0;
        int twoFreq = 0;
        for (int i:nums) {
            if (i==0) {zeroFreq++;}
            else if (i==1) {oneFreq++;}
            else if (i==2) {twoFreq++;}
        }
        for (int i = 0; i < zeroFreq; i++) {
            nums[i] = 0;

        }
        for (int i = zeroFreq; i < oneFreq + zeroFreq; i++) {
            nums[i] = 1;
        }
        for (int i = oneFreq + zeroFreq; i < twoFreq + zeroFreq + oneFreq; i++) {
            nums[i] = 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sorting012(arr);
        System.out.print("The sorted array: "+ Arrays.toString(arr));
    }
}
