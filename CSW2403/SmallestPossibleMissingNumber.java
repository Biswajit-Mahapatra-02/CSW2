package CSW2403;

import java.util.HashMap;
import java.util.Scanner;

public class SmallestPossibleMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("The smallest possible missing number of the given array is: "+findSmallestMissing(arr));
        System.out.println("The smallest possible missing number of the given array is: "+SmallestPositiveMissingNumber2(arr,arr.length));
    }
//    public static int findSmallestMissing(int[] arr) {
//        int n = arr.length;
//        boolean[] marked = new boolean[n+1];
//        for (int i = 0; i < n; i++) {
//            int x = arr[i];
//            if (x >= 1 && x <= n) {
//                marked[x] = true;
//            }
//        }
//        for (int i = 1; i <= n; i++) {
//            if (!marked[i]) {
//                return i;
//            }
//        }
//        return n+1;
//    }
    public static int SmallestPositiveMissingNumber2(int[] arr, int size){
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0;i< size; i++) {
            hs.put(arr[i], 1);
        }
        for(int i=1;i< size+1; i++) {
            if (!hs.containsKey(i)){
                return i;
            }
        }
        return -1;
    }

}
