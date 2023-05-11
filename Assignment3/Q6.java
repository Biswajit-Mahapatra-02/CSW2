package Assignment3;

import java.util.HashSet;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        evenOdd(arr);
    }
    public static void evenOdd(int[] arr){
        HashSet<Integer> even = new HashSet<>();
        HashSet<Integer> odd = new HashSet<>();
        for (int i : arr) {
            if(i%2==0)
                even.add(i);
            else odd.add(i);
        }
        System.out.println("Even elements: "+even);
        System.out.println("Odd elements: "+odd);
    }
}
