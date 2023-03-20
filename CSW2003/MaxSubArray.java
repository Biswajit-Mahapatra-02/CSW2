package CSW2003;

import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The max sub-array sum: "+MaxSA(arr));
    }
    static int MaxSA(int[] arr){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int j : arr) {
            max_ending_here = max_ending_here + j;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
