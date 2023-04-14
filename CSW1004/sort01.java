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
        sorting01(arr);
        System.out.print("The sorted array: "+ Arrays.toString(arr));
    }
    public static void sorting01(int[] num){
        int zeroFreq=0;
        int oneFreq =0;
        for (int i:num) {
            if (i==0) {zeroFreq++;}
            else if (i==1) {oneFreq++;}
        }
        for (int i = 0; i < zeroFreq; i++) {
            num[i] = 0;
        }
        for (int i = zeroFreq; i < oneFreq + zeroFreq; i++) {
            num[i] = 1;
        }
    }
}
