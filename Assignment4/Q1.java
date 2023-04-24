package Assignment4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int x : arr) {
            if(search(arr,arr.length,x)){
                System.out.println("The first element that is repeated: "+x);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("No elements are repeated in this array.");
    }
    public static boolean search(int[] arr, int size, int ele){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(ele == arr[i])
                count++;
        }
        return count > 1;
    }
}
