package CSW1404;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    private static void mergeSrt(int[] arr, int[] tempArray, int lowerIndex,
                                 int upperIndex) {
        if (lowerIndex >= upperIndex) {
            return;
        }
        int middleIndex = (lowerIndex + upperIndex) / 2;
        mergeSrt(arr, tempArray, lowerIndex, middleIndex);
        mergeSrt(arr, tempArray, middleIndex + 1, upperIndex);
        int lowerStart = lowerIndex;
        int upperStart = middleIndex + 1;
        int count = lowerIndex;
        while (lowerStart <= middleIndex && upperStart <= upperIndex) {
            if (arr[lowerStart] < arr[upperStart]) {
                tempArray[count++] = arr[lowerStart++];
            } else {
                tempArray[count++] = arr[upperStart++];
            }
        }
        while (lowerStart <= middleIndex) {
            tempArray[count++] = arr[lowerStart++];
        }
        while (upperStart <= upperIndex) {
            tempArray[count++] = arr[upperStart++];
        }
        if (upperIndex + 1 - lowerIndex >= 0)
            System.arraycopy(tempArray, lowerIndex, arr, lowerIndex, upperIndex + 1 - lowerIndex);
    }
    public static void mergeSort(int[] arr) {
        int size = arr.length;
        int[] tempArray = new int[size];
        mergeSrt(arr, tempArray, 0, size - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        mergeSort(array);
        System.out.println("The merge sorted array: "+ Arrays.toString(array));
    }
}
