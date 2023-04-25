package Assignment4;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        int res = search(arr,x);
        if(res != -1)
            System.out.println("The element was found in index: "+res);
        else System.out.println("Element was not found.");

    }
    public static int search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
