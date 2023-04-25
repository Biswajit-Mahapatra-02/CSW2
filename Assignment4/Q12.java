package Assignment4;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter a value: ");
        int value = sc.nextInt();
        findSumPair(arr1,n1,arr2,n2,value);
    }
    public static void findSumPair(int[] arr1, int n1, int[] arr2, int n2, int value){
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr1[i]+arr2[j]==value)
                    System.out.println("The required pair: ("+arr1[i]+", "+arr2[j]+")");
            }
        }
    }
}
