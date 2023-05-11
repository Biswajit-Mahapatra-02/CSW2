package Assignment3;

import java.util.HashSet;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }System.out.print("Enter the size: ");
        n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        union(arr1,arr2);
        intersection(arr1,arr2);
    }
    public static void union(int[] arr1, int[] arr2){
        HashSet<Integer> HS = new HashSet<>();
        for (int i : arr1) {
            HS.add(i);
        }for (int i : arr2) {
            HS.add(i);
        }
        System.out.println("Union: "+HS);
    }
    public static void intersection(int[] arr1, int[] arr2){
        HashSet<Integer> HS = new HashSet<>();
        HashSet<Integer> HS1 = new HashSet<>();

        for (int i : arr1) {
            HS.add(i);
        }
        for (int i : arr2) {
            if(HS.contains(i))
                HS1.add(i);
        }
        System.out.println("Intersection: "+HS1);
    }
}
