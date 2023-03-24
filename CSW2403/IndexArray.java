package CSW2403;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Given an array of size n containing elements from 0 to n-1. All values from 0 to n-1 are present in the array and if they are not there then -1 is there to take its place.
// Arrange the values of the array so that the value i is stored at arr[i]
// Input: 8 -1 6 1 9 3 2 7 4 -1   n=10
// Output: -1 1 2 3 4 -1 6 7 8 -1
public class IndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            int x;
            do{
                x = sc.nextInt();
                try{
                    if(x>arr.length-1)
                        throw new InputMismatchException();
                } catch (InputMismatchException e){
                    System.out.print("Enter a number less than "+(arr.length-1)+": ");
                }
            } while(x>=arr.length);
            arr[i] = x;
        }
        System.out.println("The arranged array is: "+ Arrays.toString(arrange(arr)));
    }
    static int[] arrange(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i && arr[i]!=-1)
            {
                int a =arr[i];
                while(arr[a]!=-1&&arr[a]!=a)
                {
                    int b=arr[a];
                    arr[a]=a;
                    a=b;
                }
                arr[a]=a;
                if(arr[i]!=i)
                {
                    arr[i]=-1;
                }
            }
        }
        return arr;
    }
}
