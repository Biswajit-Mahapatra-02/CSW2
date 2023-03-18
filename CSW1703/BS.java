package CSW1703;

import java.util.Arrays;
import java.util.Scanner;

//WAP to search for an element in an array using binary search.
public class BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt();
        int i = BinarySearch(arr,0,arr.length,x);
        if(i != -1) System.out.println("The element was found at index: "+ i);
        else System.out.println("The element was not found.");
    }
    // Madam told to do this using iterative binary search, I have used recursive because it is shorter
    // Continue at your own discretion!
    static int BinarySearch(int[] a, int i, int j, int x){
        int mid = (i+j)/2;
        if(i>=j) return -1;
        else if (a[mid] == x) return mid;
        else if (a[mid] < x) return BinarySearch(a, mid+1,j, x);
        else return BinarySearch(a, i,mid-1, x);
    }
}
