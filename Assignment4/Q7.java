package Assignment4;

import java.util.Scanner;

public class Q7 {
    public static int search(int[] arr, int size, int ele){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(ele == arr[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : arr) {
            if(search(arr,arr.length,x)%2!=0)
                System.out.println("The element that repeats odd number of times: "+x);
        }
    }
}
