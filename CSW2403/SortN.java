package CSW2403;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Sort 1 to N
// Smallest possible missing number
public class SortN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
//            int x;
//            do{
//                x = sc.nextInt();
//                try{
//                    if(x>arr.length-1 || x<1)
//                        throw new InputMismatchException();
//                } catch (InputMismatchException e){
//                    System.out.print("Enter a number less than "+(arr.length-1)+": ");
//                }
//            } while(x>=arr.length);
//            arr[i] = x;
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,arr.length);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
    static void merge(int[] a, int beg, int mid, int end)
    {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] a, int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }
}
